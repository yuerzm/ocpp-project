package com.tatadok.ocpp.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.networknt.schema.ValidationMessage;
import com.tatadok.ocpp.core.exception.ActionRequestMalformedException;
import com.tatadok.ocpp.core.exception.ActionResponseMalformedException;
import com.tatadok.ocpp.core.exception.ErrorDetail;
import com.tatadok.ocpp.core.exception.ErrorDetailCode;
import com.tatadok.ocpp.core.exception.FormatViolationException;
import com.tatadok.ocpp.core.exception.MalformedOcppMessageException;
import com.tatadok.ocpp.core.exception.MessageErrorCode;
import com.tatadok.ocpp.core.exception.MessageTypeException;
import com.tatadok.ocpp.core.exception.NotImplementedException;
import com.tatadok.ocpp.core.message.OcppCallErrorMessage;
import com.tatadok.ocpp.core.message.OcppCallMessage;
import com.tatadok.ocpp.core.message.OcppCallResultMessage;
import com.tatadok.ocpp.core.message.OcppMessage;
import com.tatadok.ocpp.core.message.OcppMessageType;
import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.core.message.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractOcppJsonParser implements OcppJsonParser {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final OcppJsonMapper objectMapper;
    private final OcppJsonValidatorImpl jsonValidator;

    public AbstractOcppJsonParser(OcppJsonMapper objectMapper, OcppJsonValidatorImpl jsonValidator) {
        this.objectMapper = objectMapper;
        this.jsonValidator = jsonValidator;
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
                Request request = objectMapper.readValue(jsonMessage.getPayload().traverse(), requestClass);
                return new OcppCallMessage(jsonMessage.getUniqueId(), jsonMessage.getAction(), request);
            } catch (IOException e) {
                List<ErrorDetail> errorDetails = new ArrayList<>();
                errorDetails.add(new ErrorDetail(ErrorDetailCode.PAYLOAD.name(), jsonMessage.getPayload().asText()));
                errorDetails.add(new ErrorDetail(ErrorDetailCode.ACTION.name(), jsonMessage.getAction()));
                throw new ActionRequestMalformedException(e.getMessage(), jsonMessage.getUniqueId(), errorDetails);
            }

        } else if (jsonMessage.getMessageType() == OcppMessageType.CALL_RESULT) {
            Class<? extends Response> responseClass = getResponseClass(jsonMessage.getUniqueId());
            validateJson(jsonMessage.getUniqueId(), responseClass.getSimpleName(), jsonMessage.getPayload());
            try {
                Response response = objectMapper.readValue(jsonMessage.getPayload().traverse(), responseClass);
                return new OcppCallResultMessage(jsonMessage.getUniqueId(), response);
            } catch (IOException e) {
                List<ErrorDetail> errorDetails = new ArrayList<>();
                errorDetails.add(new ErrorDetail(ErrorDetailCode.ACTION.name(), getActionFromPayload(responseClass)));
                errorDetails.add(new ErrorDetail(ErrorDetailCode.PAYLOAD.name(), jsonMessage.getPayload().asText()));
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
            return objectMapper.readTree(message);
        } catch (IOException e) {
            List<ErrorDetail> errorDetails = new ArrayList<>();
            errorDetails.add(new ErrorDetail(ErrorDetailCode.PAYLOAD.name(), message));
            throw new MalformedOcppMessageException("Cannot read OCPP JSON-RPC message to JsonNode.", errorDetails, e);
        }
    }

    private JsonMessage<JsonNode> parseJsonNode(JsonNode jsonNode) {
        String uniqueId = "undefined";
        int messageTypeId;

        try {
            uniqueId = jsonNode.get(OcppMessage.INDEX_MESSAGE_UNIQUE_ID).asText();
            messageTypeId = jsonNode.get(OcppMessage.INDEX_MESSAGE_TYPE_ID).asInt();
        } catch (Exception e) {
            List<ErrorDetail> errorDetails = new ArrayList<>();
            errorDetails.add(new ErrorDetail(ErrorDetailCode.PAYLOAD.name(), jsonNode.toString()));
            throw new FormatViolationException("Malformed messageType in json: " + jsonNode, uniqueId, errorDetails);
        }

        if (messageTypeId == OcppMessageType.CALL.getCode()) {
            String action = jsonNode.get(OcppMessage.INDEX_CALL_ACTION).asText();
            JsonNode payload = jsonNode.get(OcppMessage.INDEX_CALL_PAYLOAD);
            return JsonMessage.call(uniqueId, action, payload);
        }

        if (messageTypeId == OcppMessageType.CALL_RESULT.getCode()) {
            JsonNode payload = jsonNode.get(OcppMessage.INDEX_RESULT_PAYLOAD);
            return JsonMessage.result(uniqueId, payload);
        }

        if (messageTypeId == OcppMessageType.CALL_ERROR.getCode()) {
            MessageErrorCode errorCode = MessageErrorCode.fromName(jsonNode.get(OcppMessage.INDEX_ERROR_CODE).asText());
            String errorDescription = jsonNode.get(OcppMessage.INDEX_ERROR_DESCRIPTION).asText();
            JsonNode errorDetails = jsonNode.get(OcppMessage.INDEX_ERROR_DETAILS);
            return JsonMessage.error(uniqueId, errorCode, errorDescription, errorDetails);
        }

        throw new MessageTypeException("Unknown messageType in json: " + jsonNode.asText(), uniqueId);
    }

    protected void validateJson(String uniqueId, String className, JsonNode payload) {
        List<ValidationMessage> validate = jsonValidator.validate(className, payload);
        if (!validate.isEmpty()) {
            List<ErrorDetail> errorDetails = validate.stream()
                .map(x -> new ErrorDetail(x.getCode(),
                    String.format("Validations error : message=%s, details=%s", x.getMessage(), x.getDetails())))
                .toList();
            throw new FormatViolationException("Json Schema validate failed, json: " + payload, uniqueId, errorDetails);
        }
    }

    protected Class<? extends Request> getRequestClass(String uniqueId, String action) {
        Class<? extends Request> requestClass = retrieveRequestClass(action);
        if (Objects.isNull(requestClass)) {
            throw new NotImplementedException("Cannot find request class for action: " + action, uniqueId);
        }
        return requestClass;
    }

    protected Class<? extends Response> getResponseClass(String uniqueId) {
        Class<? extends Response> responseClass = retrieveResponseClass(uniqueId);
        if (Objects.isNull(responseClass)) {
            throw new NotImplementedException("Cannot find response class for uniqueId: " + uniqueId, uniqueId);
        }
        return responseClass;
    }

    protected String getActionFromPayload(Class<?> clazz) {
        return clazz.getSimpleName().replace("Request", "").replace("Response", "");
    }

    protected abstract Class<? extends Request> retrieveRequestClass(String action);

    protected abstract Class<? extends Response> retrieveResponseClass(String uniqueId);

}
