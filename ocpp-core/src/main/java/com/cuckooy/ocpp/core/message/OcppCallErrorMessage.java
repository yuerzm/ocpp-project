package com.cuckooy.ocpp.core.message;

import com.cuckooy.ocpp.core.exception.MessageErrorCode;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * The type Ocpp call error message.
 */
@Data
@Setter(AccessLevel.PROTECTED)
public class OcppCallErrorMessage extends OcppMessage {

    private MessageErrorCode errorCode;
    private String errorDescription;
    private Object errorDetails;

    private OcppCallErrorMessage(String uniqueId, String errorCode, String errorDescription, String errorDetails) {
        super(OcppMessageType.CALL_ERROR, uniqueId);
        this.errorCode = MessageErrorCode.fromName(errorCode);
        this.errorDescription = errorDescription;
        this.errorDetails = errorDetails;
    }

    /**
     * Instantiates a new Ocpp call error message.
     *
     * @param uniqueId     the unique id
     * @param errorCode    the error code
     * @param errorDetails the error details
     */
    public OcppCallErrorMessage(String uniqueId, MessageErrorCode errorCode, Object errorDetails) {
        this(uniqueId, errorCode, errorCode.toString(), errorDetails);
    }

    /**
     * Instantiates a new Ocpp call error message.
     *
     * @param uniqueId         the unique id
     * @param errorCode        the error code
     * @param errorDescription the error description
     * @param errorDetails     the error details
     */
    public OcppCallErrorMessage(String uniqueId, MessageErrorCode errorCode, String errorDescription,
                                Object errorDetails) {
        super(OcppMessageType.CALL_ERROR, uniqueId);
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        this.errorDetails = errorDetails;
    }

    /**
     * Generic deserialize error ocpp call error message.
     *
     * @param uniqueId the unique id
     * @param details  the details
     * @return the ocpp call error message
     */
    public static OcppCallErrorMessage genericDeserializeError(String uniqueId, String details) {
        return new OcppCallErrorMessage(uniqueId, MessageErrorCode.GenericError, details);
    }

    /**
     * Payload deserialize error ocpp call error message.
     *
     * @param uniqueId the unique id
     * @param details  the details
     * @return the ocpp call error message
     */
    public static OcppCallErrorMessage payloadDeserializeError(String uniqueId, String details) {
        return new OcppCallErrorMessage(uniqueId, MessageErrorCode.FormationViolation, details);
    }

    /**
     * Payload serialize error ocpp call error message.
     *
     * @param uniqueId the unique id
     * @param details  the details
     * @return the ocpp call error message
     */
    public static OcppCallErrorMessage payloadSerializeError(String uniqueId, String details) {
        return new OcppCallErrorMessage(uniqueId, MessageErrorCode.InternalError, details);
    }

    /**
     * Payload processing error ocpp call error message.
     *
     * @param uniqueId the unique id
     * @param details  the details
     * @return the ocpp call error message
     */
    public static OcppCallErrorMessage payloadProcessingError(String uniqueId, String details) {
        return new OcppCallErrorMessage(uniqueId, MessageErrorCode.InternalError, details);
    }

    /**
     * Occur constraint violation ocpp call error message.
     *
     * @param uniqueId the unique id
     * @return the ocpp call error message
     */
    public static OcppCallErrorMessage occurConstraintViolation(String uniqueId) {
        return new OcppCallErrorMessage(uniqueId, MessageErrorCode.OccurenceConstraintViolation, "{}");
    }

    /**
     * Not implemented ocpp call error message.
     *
     * @param uniqueId the unique id
     * @return the ocpp call error message
     */
    public static OcppCallErrorMessage notImplemented(String uniqueId) {
        return new OcppCallErrorMessage(uniqueId, MessageErrorCode.NotImplemented, "{}");
    }
}