package com.tatadok.ocpp.core.exception;

import java.io.Serial;
import java.util.List;

public class MalformedOcppMessageException extends OcppParserException {

    @Serial
    private static final long serialVersionUID = -2040936966916274092L;

    public MalformedOcppMessageException(String message, List<ErrorDetail> errorDetails) {
        super(message, null, MessageErrorCode.FormatViolation, errorDetails);
    }

    public MalformedOcppMessageException(String message, List<ErrorDetail> errorDetails, Throwable cause) {
        super(message, null, MessageErrorCode.FormatViolation, errorDetails, cause);
    }
}
