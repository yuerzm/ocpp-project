package com.tatadok.ocpp.core.exception;

import java.io.Serial;

public class InternalErrorException extends OcppException {

    @Serial
    private static final long serialVersionUID = -7491856151417562031L;

    public InternalErrorException(String message) {
        super(message, null, MessageErrorCode.InternalError, null, null, null);
    }
}