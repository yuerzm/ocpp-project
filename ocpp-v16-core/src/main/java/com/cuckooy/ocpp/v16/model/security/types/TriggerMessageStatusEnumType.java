package com.cuckooy.ocpp.v16.model.security.types;

public enum TriggerMessageStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    NotImplemented("NotImplemented");

    private final String value;

    TriggerMessageStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
