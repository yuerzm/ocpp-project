package com.cuckooy.ocpp.json;

import com.cuckooy.ocpp.core.exception.ActionRequestMalformedException;
import com.cuckooy.ocpp.core.exception.ActionResponseMalformedException;
import com.cuckooy.ocpp.core.exception.ErrorDetail;
import com.cuckooy.ocpp.core.exception.ErrorDetailCode;
import com.cuckooy.ocpp.core.exception.FormatViolationException;
import com.cuckooy.ocpp.core.exception.MalformedOcppMessageException;
import com.cuckooy.ocpp.core.exception.MessageErrorCode;
import com.cuckooy.ocpp.core.exception.MessageTypeException;
import com.cuckooy.ocpp.core.exception.NotImplementedException;
import com.cuckooy.ocpp.core.message.OcppCallErrorMessage;
import com.cuckooy.ocpp.core.message.OcppCallMessage;
import com.cuckooy.ocpp.core.message.OcppCallResultMessage;
import com.cuckooy.ocpp.core.message.OcppMessage;
import com.cuckooy.ocpp.core.message.OcppMessageType;
import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.networknt.schema.Error;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tools.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The type Abstract ocpp json parser.
 */
public abstract class AbstractOcppJsonParser implements OcppJsonParser {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final OcppJsonMapper ocppJsonMapper;
    private final OcppJsonValidatorImpl ocppJsonValidator;

    /**
     * Instantiates a new Abstract ocpp json parser.
     *
     * @param ocppJsonMapper    the ocpp json mapper
     * @param ocppJsonValidator the ocpp json validator
     */
    public AbstractOcppJsonParser(OcppJsonMapper ocppJsonMapper, OcppJsonValidatorImpl ocppJsonValidator) {
        this.ocppJsonMapper = ocppJsonMapper;
        this.ocppJsonValidator = ocppJsonValidator;
    }

    @Override
    public OcppMessage readJson(String message) {
        if (logger.isDebugEnabled()) {
            logger.debug("Reading json message: {}", message);
        }
        JsonNode jsonNode = readJsonNode(message);

        JsonMessage<JsonNode> jsonMessage = parseJsonNode(jsonNode);

        if (jsonMessage.getMessageType() == OcppMessageType.CALL) {
            Class<? extends Request> requestClass = getRequestClass(jsonMessage.getUniqueId(), jsonMessage.getAction());
            validateJson(jsonMessage.getUniqueId(), requestClass.getSimpleName(), jsonMessage.getPayload());
            try {
                Request request = ocppJsonMapper.convertValue(jsonMessage.getPayload(), requestClass);
                return new OcppCallMessage(jsonMessage.getUniqueId(), jsonMessage.getAction(), request);
            } catch (Exception e) {
                List<ErrorDetail> errorDetails = new ArrayList<>();
                errorDetails.add(new ErrorDetail(ErrorDetailCode.PAYLOAD.name(), jsonMessage.getPayload().asString()));
                errorDetails.add(new ErrorDetail(ErrorDetailCode.ACTION.name(), jsonMessage.getAction()));
                throw new ActionRequestMalformedException(e.getMessage(), jsonMessage.getUniqueId(), errorDetails);
            }

        } else if (jsonMessage.getMessageType() == OcppMessageType.CALL_RESULT) {
            Class<? extends Response> responseClass = getResponseClass(jsonMessage.getUniqueId());
            validateJson(jsonMessage.getUniqueId(), responseClass.getSimpleName(), jsonMessage.getPayload());
            try {
                Response response = ocppJsonMapper.convertValue(jsonMessage.getPayload(), responseClass);
                return new OcppCallResultMessage(jsonMessage.getUniqueId(), response);
            } catch (Exception e) {
                List<ErrorDetail> errorDetails = new ArrayList<>();
                errorDetails.add(new ErrorDetail(ErrorDetailCode.ACTION.name(), getActionFromPayload(responseClass)));
                errorDetails.add(new ErrorDetail(ErrorDetailCode.PAYLOAD.name(), jsonMessage.getPayload().asString()));
                throw new ActionResponseMalformedException(e.getMessage(), jsonMessage.getUniqueId(), errorDetails);
            }

        } else if (jsonMessage.getMessageType() == OcppMessageType.CALL_ERROR) {
            return new OcppCallErrorMessage(jsonMessage.getUniqueId(), jsonMessage.getErrorCode(),
                jsonMessage.getErrorDescription(), jsonMessage.getErrorDetails());

        } else {
            throw new MessageTypeException("Unsupported message type: " + jsonMessage.getMessageType(),
                jsonMessage.getUniqueId());
        }
    }

    private JsonNode readJsonNode(String message) {
        try {
            return ocppJsonMapper.readTree(message);
        } catch (Exception e) {
            List<ErrorDetail> errorDetails = new ArrayList<>();
            errorDetails.add(new ErrorDetail(ErrorDetailCode.PAYLOAD.name(), message));
            throw new MalformedOcppMessageException("Cannot read OCPP JSON-RPC message to JsonNode.", errorDetails, e);
        }
    }

    private JsonMessage<JsonNode> parseJsonNode(JsonNode jsonNode) {
        String uniqueId = "undefined";
        int messageTypeId;

        try {
            uniqueId = jsonNode.get(OcppMessage.INDEX_MESSAGE_UNIQUE_ID).asString();
            messageTypeId = jsonNode.get(OcppMessage.INDEX_MESSAGE_TYPE_ID).asInt();
        } catch (Exception e) {
            List<ErrorDetail> errorDetails = new ArrayList<>();
            errorDetails.add(new ErrorDetail(ErrorDetailCode.PAYLOAD.name(), jsonNode.toString()));
            throw new FormatViolationException("Malformed messageType in json: " + jsonNode, uniqueId, errorDetails);
        }

        if (messageTypeId == OcppMessageType.CALL.getCode()) {
            String action = jsonNode.get(OcppMessage.INDEX_CALL_ACTION).asString();
            JsonNode payload = jsonNode.get(OcppMessage.INDEX_CALL_PAYLOAD);
            return JsonMessage.call(uniqueId, action, payload);
        }

        if (messageTypeId == OcppMessageType.CALL_RESULT.getCode()) {
            JsonNode payload = jsonNode.get(OcppMessage.INDEX_RESULT_PAYLOAD);
            return JsonMessage.result(uniqueId, payload);
        }

        if (messageTypeId == OcppMessageType.CALL_ERROR.getCode()) {
            MessageErrorCode errorCode = MessageErrorCode.fromName(
                jsonNode.get(OcppMessage.INDEX_ERROR_CODE).asString());
            String errorDescription = jsonNode.get(OcppMessage.INDEX_ERROR_DESCRIPTION).asString();
            JsonNode errorDetails = jsonNode.get(OcppMessage.INDEX_ERROR_DETAILS);
            return JsonMessage.error(uniqueId, errorCode, errorDescription, errorDetails);
        }

        throw new MessageTypeException("Unknown messageType in json: " + jsonNode.asString(), uniqueId);
    }

    /**
     * Validate json.
     *
     * @param uniqueId  the unique id
     * @param className the class name
     * @param payload   the payload
     */
    protected void validateJson(String uniqueId, String className, JsonNode payload) {
        List<Error> validate = ocppJsonValidator.validate(className, payload);
        if (!validate.isEmpty()) {
            List<ErrorDetail> errorDetails = validate.stream()
                .map(x -> new ErrorDetail(x.getKeyword(),
                    String.format("Validations error : message=%s, details=%s", x.getMessage(), x.getDetails())))
                .toList();
            throw new FormatViolationException("Json Schema validate failed, json: " + payload, uniqueId, errorDetails);
        }
    }

    /**
     * Gets request class.
     *
     * @param uniqueId the unique id
     * @param action   the action
     * @return the request class
     */
    protected Class<? extends Request> getRequestClass(String uniqueId, String action) {
        Class<? extends Request> requestClass = retrieveRequestClass(action);
        if (Objects.isNull(requestClass)) {
            throw new NotImplementedException("Cannot find request class for action: " + action, uniqueId);
        }
        return requestClass;
    }

    /**
     * Gets response class.
     *
     * @param uniqueId the unique id
     * @return the response class
     */
    protected Class<? extends Response> getResponseClass(String uniqueId) {
        Class<? extends Response> responseClass = retrieveResponseClass(uniqueId);
        if (Objects.isNull(responseClass)) {
            throw new NotImplementedException("Cannot find response class for uniqueId: " + uniqueId, uniqueId);
        }
        return responseClass;
    }

    /**
     * Gets action from payload.
     *
     * @param clazz the clazz
     * @return the action from payload
     */
    protected String getActionFromPayload(Class<?> clazz) {
        return clazz.getSimpleName().replace("Request", "").replace("Response", "");
    }

    /**
     * Retrieve request class class.
     *
     * @param action the action
     * @return the class
     */
    protected abstract Class<? extends Request> retrieveRequestClass(String action);

    /**
     * Retrieve response class class.
     *
     * @param uniqueId the unique id
     * @return the class
     */
    protected abstract Class<? extends Response> retrieveResponseClass(String uniqueId);

}
