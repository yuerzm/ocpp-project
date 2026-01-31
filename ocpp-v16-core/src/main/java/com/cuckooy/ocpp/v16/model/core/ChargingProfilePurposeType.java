package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Charging profile purpose type.
 */
public enum ChargingProfilePurposeType {

    /**
     * Charge point max profile charging profile purpose type.
     */
    ChargePointMaxProfile("ChargePointMaxProfile"),

    /**
     * Tx default profile charging profile purpose type.
     */
    TxDefaultProfile("TxDefaultProfile"),

    /**
     * Tx profile charging profile purpose type.
     */
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
