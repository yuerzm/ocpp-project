package com.tatadok.ocpp.core.exception;

import java.io.Serial;
import java.util.List;

public class MessageTypeException extends OcppParserException {

    @Serial
    private static final long serialVersionUID = -4452404932984022479L;

    public MessageTypeException(String message, String uniqueId) {
        super(message, uniqueId, MessageErrorCode.MessageTypeNotSupported, null);
    }

    public MessageTypeException(String message, String uniqueId, List<ErrorDetail> errorDetails) {
        super(message, uniqueId, MessageErrorCode.MessageTypeNotSupported, errorDetails);
    }
}
