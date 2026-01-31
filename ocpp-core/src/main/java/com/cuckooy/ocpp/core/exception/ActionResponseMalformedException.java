package com.cuckooy.ocpp.core.exception;

import java.io.Serial;
import java.util.List;

/**
 * The type Action response malformed exception.
 */
public class ActionResponseMalformedException extends OcppParserException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Action response malformed exception.
     *
     * @param message      the message
     * @param uniqueId     the unique id
     * @param errorDetails the error details
     */
    public ActionResponseMalformedException(String message, String uniqueId, List<ErrorDetail> errorDetails) {
        super(message, uniqueId, MessageErrorCode.NotImplemented, errorDetails);
    }
}
