package com.cuckooy.ocpp.core.exception;

import java.io.Serial;

/**
 * The type Occurence constraint exception.
 */
public class OccurenceConstraintException extends OcppException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Occurence constraint exception.
     *
     * @param message the message
     */
    public OccurenceConstraintException(String message) {
        super(message, null, MessageErrorCode.OccurenceConstraintViolation, null, null, null);
    }
}