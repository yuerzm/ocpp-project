package com.cuckooy.ocpp.v21.model.common.enumerations;

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
    TxProfile("TxProfile"),

    /**
     * Priority charging charging profile purpose enum type.
     */
    PriorityCharging("PriorityCharging"),

    /**
     * Local generation charging profile purpose enum type.
     */
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
