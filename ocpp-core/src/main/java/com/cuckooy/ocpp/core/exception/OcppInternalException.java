package com.cuckooy.ocpp.core.exception;

import java.io.Serial;

/**
 * The type Ocpp internal exception.
 */
public class OcppInternalException extends OcppException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Ocpp internal exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public OcppInternalException(String message, Throwable cause) {
        super(message, null, MessageErrorCode.InternalError, null, null, cause);
    }
}
