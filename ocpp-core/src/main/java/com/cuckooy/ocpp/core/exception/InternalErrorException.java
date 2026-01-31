package com.cuckooy.ocpp.core.exception;

import java.io.Serial;

/**
 * The type Internal error exception.
 */
public class InternalErrorException extends OcppException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Internal error exception.
     *
     * @param message the message
     */
    public InternalErrorException(String message) {
        super(message, null, MessageErrorCode.InternalError, null, null, null);
    }
}