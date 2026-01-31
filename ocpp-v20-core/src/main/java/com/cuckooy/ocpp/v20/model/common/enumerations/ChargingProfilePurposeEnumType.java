package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Charging profile purpose enum type.
 */
public enum ChargingProfilePurposeEnumType {

    /**
     * Charging station external constraints charging profile purpose enum type.
     */
    ChargingStationExternalConstraints("ChargingStationExternalConstraints"),

    /**
     * Charging station max profile charging profile purpose enum type.
     */
    ChargingStationMaxProfile("ChargingStationMaxProfile"),

    /**
     * Tx default profile charging profile purpose enum type.
     */
    TxDefaultProfile("TxDefaultProfile"),

    /**
     * Tx profile charging profile purpose enum type.
     */
    TxProfile("TxProfile");

    private final String value;

    ChargingProfilePurposeEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
