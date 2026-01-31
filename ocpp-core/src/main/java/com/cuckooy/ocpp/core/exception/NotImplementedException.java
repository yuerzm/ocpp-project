package com.cuckooy.ocpp.core.exception;

import java.io.Serial;

/**
 * The type Not implemented exception.
 */
public class NotImplementedException extends OcppException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Not implemented exception.
     *
     * @param message  the message
     * @param uniqueId the unique id
     */
    public NotImplementedException(String message, String uniqueId) {
        super(message, uniqueId, MessageErrorCode.NotImplemented, null, null, null);
    }
}