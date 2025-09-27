package com.tatadok.ocpp.v21.model.common.enumerations;

public enum MessageStateEnumType {

    Charging("Charging"),
    Faulted("Faulted"),
    Idle("Idle"),
    Unavailable("Unavailable"),
    Suspended("Suspended"),
    Discharging("Discharging"),
    ;

    private final String value;

    MessageStateEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
