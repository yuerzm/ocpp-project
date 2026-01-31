package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Set monitoring status enum type.
 */
public enum SetMonitoringStatusEnumType {

    /**
     * Accepted set monitoring status enum type.
     */
    Accepted("Accepted"),
    /**
     * Unknown component set monitoring status enum type.
     */
    UnknownComponent("UnknownComponent"),
    /**
     * Unknown variable set monitoring status enum type.
     */
    UnknownVariable("UnknownVariable"),
    /**
     * Unsupported monitor type set monitoring status enum type.
     */
    UnsupportedMonitorType("UnsupportedMonitorType"),
    /**
     * Rejected set monitoring status enum type.
     */
    Rejected("Rejected"),
    /**
     * Duplicate set monitoring status enum type.
     */
    Duplicate("Duplicate");

    private final String value;

    SetMonitoringStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
