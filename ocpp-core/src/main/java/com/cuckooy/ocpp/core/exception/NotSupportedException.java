package com.cuckooy.ocpp.core.exception;

import java.io.Serial;

/**
 * The type Not supported exception.
 */
public class NotSupportedException extends OcppException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Not supported exception.
     *
     * @param message the message
     */
    public NotSupportedException(String message) {
        super(message, null, MessageErrorCode.NotSupported, null, null, null);
    }
}