package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Clear charging profile status enum type.
 */
public enum ClearChargingProfileStatusEnumType {

    /**
     * Accepted clear charging profile status enum type.
     */
    Accepted("Accepted"),

    /**
     * Unknown clear charging profile status enum type.
     */
    Unknown("Unknown");

    private final String value;

    ClearChargingProfileStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
