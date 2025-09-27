package com.tatadok.ocpp.v20.model.common.enumerations;

public enum ChargingRateUnitEnumType {

    W("W"),

    A("A");

    private final String value;

    ChargingRateUnitEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
