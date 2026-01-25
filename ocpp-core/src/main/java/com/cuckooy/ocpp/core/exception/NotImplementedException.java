package com.cuckooy.ocpp.core.exception;

import java.io.Serial;

public class NotImplementedException extends OcppException {

    @Serial
    private static final long serialVersionUID = 1L;

    public NotImplementedException(String message, String uniqueId) {
        super(message, uniqueId, MessageErrorCode.NotImplemented, null, null, null);
    }
}