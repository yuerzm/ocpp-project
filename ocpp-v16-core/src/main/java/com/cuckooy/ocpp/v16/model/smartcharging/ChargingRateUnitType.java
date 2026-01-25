package com.cuckooy.ocpp.v16.model.smartcharging;

public enum ChargingRateUnitType {
    W("W"),

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