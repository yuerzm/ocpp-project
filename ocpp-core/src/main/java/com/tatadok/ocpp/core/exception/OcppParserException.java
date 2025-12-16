package com.tatadok.ocpp.core.exception;

import lombok.Getter;

import java.io.Serial;

@Getter
public abstract class OcppParserException extends OcppException {

    @Serial
    private static final long serialVersionUID = 1L;

    protected OcppParserException(String message, String uniqueId, MessageErrorCode code, Object details) {
        super(message, uniqueId, code, message, details);
    }

    protected OcppParserException(String message, String uniqueId, MessageErrorCode code, Object details,
                                  Throwable throwable) {
        super(message, uniqueId, code, message, details, throwable);

    }
}
