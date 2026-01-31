package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Charging profile status enum type.
 */
public enum ChargingProfileStatusEnumType {

    /**
     * Accepted charging profile status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected charging profile status enum type.
     */
    Rejected("Rejected");

    private final String value;

    ChargingProfileStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
