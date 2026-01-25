package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum ChargingProfileKindEnumType {

    Absolute("Absolute"),

    Recurring("Recurring"),

    Relative("Relative"),

    Dynamic("Dynamic");

    private final String value;

    ChargingProfileKindEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
