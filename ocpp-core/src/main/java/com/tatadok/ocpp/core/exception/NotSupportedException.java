package com.tatadok.ocpp.core.exception;

import java.io.Serial;

public class NotSupportedException extends OcppException {

    @Serial
    private static final long serialVersionUID = 6500521039135501462L;

    public NotSupportedException(String message) {
        super(message, null, MessageErrorCode.NotSupported, null, null, null);
    }
}