package com.cuckooy.ocpp.core.exception;

import java.io.Serial;
import java.util.List;

public class FormatViolationException extends OcppParserException {

    @Serial
    private static final long serialVersionUID = 1L;

    public FormatViolationException(String message, String uniqueId) {
        super(message, uniqueId, MessageErrorCode.FormationViolation, null);
    }

    public FormatViolationException(String message, String uniqueId, List<ErrorDetail> errorDetails) {
        super(message, uniqueId, MessageErrorCode.FormationViolation, errorDetails);
    }
}
