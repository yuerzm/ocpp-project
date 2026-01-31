package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Notify ev charging needs status enum type.
 */
public enum NotifyEVChargingNeedsStatusEnumType {

    /**
     * Accepted notify ev charging needs status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected notify ev charging needs status enum type.
     */
    Rejected("Rejected"),

    /**
     * Processing notify ev charging needs status enum type.
     */
    Processing("Processing");

    private final String value;

    NotifyEVChargingNeedsStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
