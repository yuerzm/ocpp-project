package com.tatadok.ocpp.core.exception;

public enum ErrorDetailCode {

    STACKTRACE("stackTrace"),
    ACTION("action"),
    MISSING_FIELD_REPLACED("missingFieldReplaced"),
    CONVERT_FIELD_REPLACED("convertFieldReplaced"),
    CONVERT_FIELD_EXCEPTION("convertFieldException"),
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
