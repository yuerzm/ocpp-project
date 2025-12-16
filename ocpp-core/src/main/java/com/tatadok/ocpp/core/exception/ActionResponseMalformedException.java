package com.tatadok.ocpp.core.exception;

import java.io.Serial;
import java.util.List;

public class ActionResponseMalformedException extends OcppParserException {

    @Serial
    private static final long serialVersionUID = 1L;

    public ActionResponseMalformedException(String message, String uniqueId, List<ErrorDetail> errorDetails) {
        super(message, uniqueId, MessageErrorCode.NotImplemented, errorDetails);
    }
}
