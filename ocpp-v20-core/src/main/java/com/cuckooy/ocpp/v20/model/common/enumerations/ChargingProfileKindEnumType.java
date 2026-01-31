package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Charging profile kind enum type.
 */
public enum ChargingProfileKindEnumType {
    /**
     * Absolute charging profile kind enum type.
     */
    Absolute("Absolute"),

    /**
     * Recurring charging profile kind enum type.
     */
    Recurring("Recurring"),

    /**
     * Relative charging profile kind enum type.
     */
    Relative("Relative");

    private final String value;

    ChargingProfileKindEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
