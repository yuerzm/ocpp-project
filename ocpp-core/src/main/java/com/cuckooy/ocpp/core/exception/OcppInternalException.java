package com.cuckooy.ocpp.core.exception;

import java.io.Serial;

public class OcppInternalException extends OcppException {

    @Serial
    private static final long serialVersionUID = 1L;

    public OcppInternalException(String message, Throwable cause) {
        super(message, null, MessageErrorCode.InternalError, null, null, cause);
    }
}
