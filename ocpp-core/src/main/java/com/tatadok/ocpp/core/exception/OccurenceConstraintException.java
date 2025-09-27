package com.tatadok.ocpp.core.exception;

import java.io.Serial;

public class OccurenceConstraintException extends OcppException {

    @Serial
    private static final long serialVersionUID = -1554597990261405645L;

    public OccurenceConstraintException(String message) {
        super(message, null, MessageErrorCode.OccurenceConstraintViolation, null, null, null);
    }
}