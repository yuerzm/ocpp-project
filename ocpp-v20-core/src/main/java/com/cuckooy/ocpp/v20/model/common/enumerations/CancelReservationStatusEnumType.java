package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Cancel reservation status enum type.
 */
public enum CancelReservationStatusEnumType {

    /**
     * Accepted cancel reservation status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected cancel reservation status enum type.
     */
    Rejected("Rejected");

    private final String value;

    CancelReservationStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
