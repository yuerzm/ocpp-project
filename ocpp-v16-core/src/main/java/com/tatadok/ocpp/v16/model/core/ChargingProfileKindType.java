package com.tatadok.ocpp.v16.model.core;

public enum ChargingProfileKindType {

    Absolute("Absolute"),

    Recurring("Recurring"),

    Relative("Relative");

    private final String value;

    ChargingProfileKindType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}