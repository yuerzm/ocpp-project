package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum ChargingProfilePurposeEnumType {

    ChargingStationExternalConstraints("ChargingStationExternalConstraints"),

    ChargingStationMaxProfile("ChargingStationMaxProfile"),

    TxDefaultProfile("TxDefaultProfile"),

    TxProfile("TxProfile"),

    PriorityCharging("PriorityCharging"),

    LocalGeneration("LocalGeneration"),
    ;

    private final String value;

    ChargingProfilePurposeEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
