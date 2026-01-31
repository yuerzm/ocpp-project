package com.cuckooy.ocpp.core.exception;

/**
 * The enum Error detail code.
 */
public enum ErrorDetailCode {

    /**
     * Stacktrace error detail code.
     */
    STACKTRACE("stackTrace"),
    /**
     * Action error detail code.
     */
    ACTION("action"),
    /**
     * Missing field replaced error detail code.
     */
    MISSING_FIELD_REPLACED("missingFieldReplaced"),
    /**
     * Convert field replaced error detail code.
     */
    CONVERT_FIELD_REPLACED("convertFieldReplaced"),
    /**
     * Convert field exception error detail code.
     */
    CONVERT_FIELD_EXCEPTION("convertFieldException"),
    /**
     * Payload error detail code.
     */
    PAYLOAD("payload");

    private final String value;

    ErrorDetailCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
