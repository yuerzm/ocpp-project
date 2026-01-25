package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum ChargingStateEnumType {

    Charging("Charging"),
    EVConnected("EVConnected"),
    SuspendedEV("SuspendedEV"),
    SuspendedEVSE("SuspendedEVSE"),
    Idle("Idle");

    private final String value;

    ChargingStateEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
