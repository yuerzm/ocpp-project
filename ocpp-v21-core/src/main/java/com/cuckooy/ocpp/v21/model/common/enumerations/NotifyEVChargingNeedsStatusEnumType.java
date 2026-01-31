package com.cuckooy.ocpp.v21.model.common.enumerations;

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
    Processing("Processing"),

    /**
     * No charging profile notify ev charging needs status enum type.
     */
    NoChargingProfile("NoChargingProfile"),
    ;

    private final String value;

    NotifyEVChargingNeedsStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
