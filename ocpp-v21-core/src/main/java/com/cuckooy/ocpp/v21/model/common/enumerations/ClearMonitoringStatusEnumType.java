package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Clear monitoring status enum type.
 */
public enum ClearMonitoringStatusEnumType {

    /**
     * Accepted clear monitoring status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected clear monitoring status enum type.
     */
    Rejected("Rejected"),
    /**
     * Not found clear monitoring status enum type.
     */
    NotFound("NotFound");

    private final String value;

    ClearMonitoringStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
