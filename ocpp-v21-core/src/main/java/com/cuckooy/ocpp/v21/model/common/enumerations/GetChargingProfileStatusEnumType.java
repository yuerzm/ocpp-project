package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Get charging profile status enum type.
 */
public enum GetChargingProfileStatusEnumType {

    /**
     * Accepted get charging profile status enum type.
     */
    Accepted("Accepted"),
    /**
     * No profiles get charging profile status enum type.
     */
    NoProfiles("NoProfiles");

    private final String value;

    GetChargingProfileStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
