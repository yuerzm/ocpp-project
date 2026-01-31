package com.cuckooy.ocpp.core.exception;

import java.io.Serial;
import java.util.List;

/**
 * The type Message type exception.
 */
public class MessageTypeException extends OcppParserException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Message type exception.
     *
     * @param message  the message
     * @param uniqueId the unique id
     */
    public MessageTypeException(String message, String uniqueId) {
        super(message, uniqueId, MessageErrorCode.MessageTypeNotSupported, null);
    }

    /**
     * Instantiates a new Message type exception.
     *
     * @param message      the message
     * @param uniqueId     the unique id
     * @param errorDetails the error details
     */
    public MessageTypeException(String message, String uniqueId, List<ErrorDetail> errorDetails) {
        super(message, uniqueId, MessageErrorCode.MessageTypeNotSupported, errorDetails);
    }
}
