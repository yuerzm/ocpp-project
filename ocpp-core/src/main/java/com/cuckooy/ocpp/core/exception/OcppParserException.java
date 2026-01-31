package com.cuckooy.ocpp.core.exception;

import lombok.Getter;

import java.io.Serial;

/**
 * The type Ocpp parser exception.
 */
@Getter
public abstract class OcppParserException extends OcppException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Ocpp parser exception.
     *
     * @param message  the message
     * @param uniqueId the unique id
     * @param code     the code
     * @param details  the details
     */
    protected OcppParserException(String message, String uniqueId, MessageErrorCode code, Object details) {
        super(message, uniqueId, code, message, details);
    }

    /**
     * Instantiates a new Ocpp parser exception.
     *
     * @param message   the message
     * @param uniqueId  the unique id
     * @param code      the code
     * @param details   the details
     * @param throwable the throwable
     */
    protected OcppParserException(String message, String uniqueId, MessageErrorCode code, Object details,
                                  Throwable throwable) {
        super(message, uniqueId, code, message, details, throwable);

    }
}
