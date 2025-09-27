package com.tatadok.ocpp.v20.model.common.enumerations;

public enum ClearMessageStatusEnumType {

    Accepted("Accepted"),

    Unknown("Unknown");

    private final String value;

    ClearMessageStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
