package com.cuckooy.ocpp.v16.model.security.types;

public enum GenericStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected");

    private final String value;

    GenericStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
