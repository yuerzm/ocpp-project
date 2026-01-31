package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Charging state enum type.
 */
public enum ChargingStateEnumType {

    /**
     * Charging charging state enum type.
     */
    Charging("Charging"),
    /**
     * Ev connected charging state enum type.
     */
    EVConnected("EVConnected"),
    /**
     * Suspended ev charging state enum type.
     */
    SuspendedEV("SuspendedEV"),
    /**
     * Suspended evse charging state enum type.
     */
    SuspendedEVSE("SuspendedEVSE"),
    /**
     * Idle charging state enum type.
     */
    Idle("Idle");

    private final String value;

    ChargingStateEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
