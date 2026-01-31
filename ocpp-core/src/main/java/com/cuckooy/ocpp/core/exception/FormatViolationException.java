package com.cuckooy.ocpp.core.exception;

import java.io.Serial;
import java.util.List;

/**
 * The type Format violation exception.
 */
public class FormatViolationException extends OcppParserException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Format violation exception.
     *
     * @param message  the message
     * @param uniqueId the unique id
     */
    public FormatViolationException(String message, String uniqueId) {
        super(message, uniqueId, MessageErrorCode.FormationViolation, null);
    }

    /**
     * Instantiates a new Format violation exception.
     *
     * @param message      the message
     * @param uniqueId     the unique id
     * @param errorDetails the error details
     */
    public FormatViolationException(String message, String uniqueId, List<ErrorDetail> errorDetails) {
        super(message, uniqueId, MessageErrorCode.FormationViolation, errorDetails);
    }
}
