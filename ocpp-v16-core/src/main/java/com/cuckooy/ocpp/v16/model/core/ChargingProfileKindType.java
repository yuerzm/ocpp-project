package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Charging profile kind type.
 */
public enum ChargingProfileKindType {

    /**
     * Absolute charging profile kind type.
     */
    Absolute("Absolute"),

    /**
     * Recurring charging profile kind type.
     */
    Recurring("Recurring"),

    /**
     * Relative charging profile kind type.
     */
    Relative("Relative");

    private final String value;

    ChargingProfileKindType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}