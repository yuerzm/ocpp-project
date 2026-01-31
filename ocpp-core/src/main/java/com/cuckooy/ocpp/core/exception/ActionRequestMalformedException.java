package com.cuckooy.ocpp.core.exception;

import java.io.Serial;
import java.util.List;

/**
 * The type Action request malformed exception.
 */
public class ActionRequestMalformedException extends OcppParserException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Action request malformed exception.
     *
     * @param message      the message
     * @param uniqueId     the unique id
     * @param errorDetails the error details
     */
    public ActionRequestMalformedException(String message, String uniqueId, List<ErrorDetail> errorDetails) {
        super(message, uniqueId, MessageErrorCode.NotImplemented, errorDetails);
    }
}
