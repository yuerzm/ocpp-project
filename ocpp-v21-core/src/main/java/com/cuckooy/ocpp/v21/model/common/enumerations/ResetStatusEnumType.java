package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum ResetStatusEnumType {

    Accepted("Accepted"),

    Rejected("Rejected"),

    Scheduled("Scheduled");

    private final String value;

    ResetStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
