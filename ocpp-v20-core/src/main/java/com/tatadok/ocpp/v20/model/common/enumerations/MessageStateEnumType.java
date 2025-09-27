package com.tatadok.ocpp.v20.model.common.enumerations;

public enum MessageStateEnumType {

    Charging("Charging"),

    Faulted("Faulted"),

    Idle("Idle"),

    Unavailable("Unavailable");

    private final String value;

    MessageStateEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
