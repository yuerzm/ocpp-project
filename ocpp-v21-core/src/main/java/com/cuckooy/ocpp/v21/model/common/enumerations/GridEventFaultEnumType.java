package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum GridEventFaultEnumType {

    CurrentImbalance("CurrentImbalance"),
    LocalEmergency("LocalEmergency"),
    LowInputPower("LowInputPower"),
    OverCurrent("OverCurrent"),
    OverFrequency("OverFrequency"),
    OverVoltage("OverVoltage"),
    PhaseRotation("PhaseRotation"),
    RemoteEmergency("RemoteEmergency"),
    UnderFrequency("UnderFrequency"),
    UnderVoltage("UnderVoltage"),
    VoltageImbalance("VoltageImbalance"),
    ;

    private final String value;

    GridEventFaultEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
