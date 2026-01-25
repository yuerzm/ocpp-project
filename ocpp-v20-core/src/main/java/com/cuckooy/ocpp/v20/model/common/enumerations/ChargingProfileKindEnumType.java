package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum ChargingProfileKindEnumType {
    Absolute("Absolute"),

    Recurring("Recurring"),

    Relative("Relative");

    private final String value;

    ChargingProfileKindEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
