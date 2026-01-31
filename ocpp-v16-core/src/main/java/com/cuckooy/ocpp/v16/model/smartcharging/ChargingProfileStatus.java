package com.cuckooy.ocpp.v16.model.smartcharging;

/**
 * The enum Charging profile status.
 */
public enum ChargingProfileStatus {

    /**
     * Accepted charging profile status.
     */
    Accepted("Accepted"),

    /**
     * Rejected charging profile status.
     */
    Rejected("Rejected"),

    /**
     * Not supported charging profile status.
     */
    NotSupported("NotSupported");

    private final String value;

    ChargingProfileStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
