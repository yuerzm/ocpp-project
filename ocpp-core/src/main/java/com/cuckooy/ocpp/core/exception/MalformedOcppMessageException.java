package com.cuckooy.ocpp.core.exception;

import java.io.Serial;
import java.util.List;

/**
 * The type Malformed ocpp message exception.
 */
public class MalformedOcppMessageException extends OcppParserException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Malformed ocpp message exception.
     *
     * @param message      the message
     * @param errorDetails the error details
     */
    public MalformedOcppMessageException(String message, List<ErrorDetail> errorDetails) {
        super(message, null, MessageErrorCode.FormatViolation, errorDetails);
    }

    /**
     * Instantiates a new Malformed ocpp message exception.
     *
     * @param message      the message
     * @param errorDetails the error details
     * @param cause        the cause
     */
    public MalformedOcppMessageException(String message, List<ErrorDetail> errorDetails, Throwable cause) {
        super(message, null, MessageErrorCode.FormatViolation, errorDetails, cause);
    }
}
