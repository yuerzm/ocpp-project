package com.cuckooy.ocpp.v16.model.smartcharging;

/**
 * The enum Charging rate unit type.
 */
public enum ChargingRateUnitType {
    /**
     * W charging rate unit type.
     */
    W("W"),

    /**
     * A charging rate unit type.
     */
    A("A");

    private final String value;

    ChargingRateUnitType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}