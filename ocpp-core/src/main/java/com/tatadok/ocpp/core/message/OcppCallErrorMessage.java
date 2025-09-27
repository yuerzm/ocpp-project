package com.tatadok.ocpp.core.message;

import com.tatadok.ocpp.core.exception.MessageErrorCode;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

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

    public OcppCallErrorMessage(String uniqueId, MessageErrorCode errorCode, Object errorDetails) {
        this(uniqueId, errorCode, errorCode.toString(), errorDetails);
    }

    public OcppCallErrorMessage(String uniqueId, MessageErrorCode errorCode, String errorDescription,
                                Object errorDetails) {
        super(OcppMessageType.CALL_ERROR, uniqueId);
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        this.errorDetails = errorDetails;
    }

    public static OcppCallErrorMessage genericDeserializeError(String uniqueId, String details) {
        return new OcppCallErrorMessage(uniqueId, MessageErrorCode.GenericError, details);
    }

    public static OcppCallErrorMessage payloadDeserializeError(String uniqueId, String details) {
        return new OcppCallErrorMessage(uniqueId, MessageErrorCode.FormationViolation, details);
    }

    public static OcppCallErrorMessage payloadSerializeError(String uniqueId, String details) {
        return new OcppCallErrorMessage(uniqueId, MessageErrorCode.InternalError, details);
    }

    public static OcppCallErrorMessage payloadProcessingError(String uniqueId, String details) {
        return new OcppCallErrorMessage(uniqueId, MessageErrorCode.InternalError, details);
    }

    public static OcppCallErrorMessage occurConstraintViolation(String uniqueId) {
        return new OcppCallErrorMessage(uniqueId, MessageErrorCode.OccurenceConstraintViolation, "{}");
    }

    public static OcppCallErrorMessage notImplemented(String uniqueId) {
        return new OcppCallErrorMessage(uniqueId, MessageErrorCode.NotImplemented, "{}");
    }
}