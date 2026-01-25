package com.cuckooy.ocpp.v16.model.security.types;

public enum LogStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    AcceptedCanceled("AcceptedCanceled");

    private final String value;

    LogStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
