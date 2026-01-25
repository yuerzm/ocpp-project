package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum GetDisplayMessagesStatusEnumType {

    Accepted("Accepted"),
    Unknown("Unknown");

    private final String value;

    GetDisplayMessagesStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
