package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Reservation update status enum type.
 */
public enum ReservationUpdateStatusEnumType {

    /**
     * Expired reservation update status enum type.
     */
    Expired("Expired"),

    /**
     * Removed reservation update status enum type.
     */
    Removed("Removed");

    private final String value;

    ReservationUpdateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
