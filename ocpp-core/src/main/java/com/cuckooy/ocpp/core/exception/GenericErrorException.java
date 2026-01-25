package com.cuckooy.ocpp.core.exception;

import java.io.Serial;

public class GenericErrorException extends OcppException {

    @Serial
    private static final long serialVersionUID = 1L;

    public GenericErrorException(String message, String uniqueId, MessageErrorCode code, String description,
                                 Object details, Throwable cause) {
        super(message, uniqueId, code, description, details, cause);
    }
}