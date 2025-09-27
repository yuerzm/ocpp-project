package com.tatadok.ocpp.core.exception;

import java.io.Serial;
import java.util.List;

public class ActionRequestMalformedException extends OcppParserException {

    @Serial
    private static final long serialVersionUID = -6900024061775035024L;

    public ActionRequestMalformedException(String message, String uniqueId, List<ErrorDetail> errorDetails) {
        super(message, uniqueId, MessageErrorCode.NotImplemented, errorDetails);
    }
}
