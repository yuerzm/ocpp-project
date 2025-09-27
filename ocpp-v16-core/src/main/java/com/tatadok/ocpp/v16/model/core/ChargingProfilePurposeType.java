package com.tatadok.ocpp.v16.model.core;

public enum ChargingProfilePurposeType {

    ChargePointMaxProfile("ChargePointMaxProfile"),

    TxDefaultProfile("TxDefaultProfile"),

    TxProfile("TxProfile");

    private final String value;

    ChargingProfilePurposeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
