package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum ClearMessageStatusEnumType {

    Accepted("Accepted"),

    Unknown("Unknown"),

    Rejected("Rejected"),
    ;

    private final String value;

    ClearMessageStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
