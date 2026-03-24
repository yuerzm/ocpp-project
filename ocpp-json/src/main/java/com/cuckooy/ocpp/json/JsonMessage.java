package com.cuckooy.ocpp.json;

import com.cuckooy.ocpp.core.exception.MessageErrorCode;
import com.cuckooy.ocpp.core.message.OcppMessageType;
import lombok.Data;
import tools.jackson.databind.JsonNode;

import java.util.Objects;

/**
 * The type Json message.
 *
 * @param <T> the type parameter
 */
@Data
public class JsonMessage<T> {

    private OcppMessageType messageType;
    private String uniqueId;
    private String action;
    private T payload;
    private MessageErrorCode errorCode;
    private String errorDescription;
    private Object errorDetails;

    private JsonMessage(OcppMessageType messageType, String uniqueId, String action, T payload,
                        MessageErrorCode errorCode, String errorDescription, Object errorDetails) {
        this.messageType = messageType;
        this.uniqueId = uniqueId;
        this.action = action;
        this.payload = payload;
        this.errorCode = errorCode;
        this.errorDescription = Objects.nonNull(errorDescription) ? errorDescription : "";
        this.errorDetails = Objects.nonNull(errorDetails) ? errorDetails : new Object();
    }

    /**
     * Call json message.
     *
     * @param <T>      the type parameter
     * @param uniqueId the unique id
     * @param action   the action
     * @param payload  the payload
     * @return the json message
     */
    public static <T> JsonMessage<T> call(String uniqueId, String action, T payload) {
        return new JsonMessage<>(OcppMessageType.CALL, uniqueId, action, payload, null, null, null);
    }

    /**
     * Result json message.
     *
     * @param <T>      the type parameter
     * @param uniqueId the unique id
     * @param payload  the payload
     * @return the json message
     */
    public static <T> JsonMessage<T> result(String uniqueId, T payload) {
        return new JsonMessage<>(OcppMessageType.CALL_RESULT, uniqueId, null, payload, null, null, null);
    }

    /**
     * Error json message.
     *
     * @param uniqueId         the unique id
     * @param errorCode        the error code
     * @param errorDescription the error description
     * @param details          the details
     * @return the json message
     */
    public static JsonMessage<JsonNode> error(String uniqueId, MessageErrorCode errorCode, String errorDescription,
                                              JsonNode details) {
        return new JsonMessage<>(OcppMessageType.CALL_ERROR,
            uniqueId,
            null,
            null,
            errorCode,
            errorDescription,
            details);
    }

}
