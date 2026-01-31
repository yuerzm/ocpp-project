package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Charging rate unit enum type.
 */
public enum ChargingRateUnitEnumType {

    /**
     * W charging rate unit enum type.
     */
    W("W"),

    /**
     * A charging rate unit enum type.
     */
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
