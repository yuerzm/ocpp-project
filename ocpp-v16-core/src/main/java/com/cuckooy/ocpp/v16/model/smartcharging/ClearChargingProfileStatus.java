package com.cuckooy.ocpp.v16.model.smartcharging;

/**
 * The enum Clear charging profile status.
 */
public enum ClearChargingProfileStatus {

    /**
     * Accepted clear charging profile status.
     */
    Accepted("Accepted"),

    /**
     * Unknown clear charging profile status.
     */
    Unknown("Unknown");

    private final String value;

    ClearChargingProfileStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}