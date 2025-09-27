package com.tatadok.ocpp.v21.model.common.enumerations;

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
