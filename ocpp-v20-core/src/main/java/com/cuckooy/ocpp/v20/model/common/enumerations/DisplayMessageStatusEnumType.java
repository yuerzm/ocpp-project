package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum DisplayMessageStatusEnumType {

    Accepted("Accepted"),
    NotSupportedMessageFormat("NotSupportedMessageFormat"),
    Rejected("Rejected"),
    NotSupportedPriority("NotSupportedPriority"),
    NotSupportedState("NotSupportedState"),
    UnknownTransaction("UnknownTransaction");

    private final String value;

    DisplayMessageStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
