package com.cuckooy.ocpp.core.exception;

import java.io.Serial;

/**
 * The type Generic error exception.
 */
public class GenericErrorException extends OcppException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Generic error exception.
     *
     * @param message     the message
     * @param uniqueId    the unique id
     * @param code        the code
     * @param description the description
     * @param details     the details
     * @param cause       the cause
     */
    public GenericErrorException(String message, String uniqueId, MessageErrorCode code, String description,
                                 Object details, Throwable cause) {
        super(message, uniqueId, code, description, details, cause);
    }
}