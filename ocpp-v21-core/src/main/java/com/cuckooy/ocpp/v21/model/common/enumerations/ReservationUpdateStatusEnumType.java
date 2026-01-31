package com.cuckooy.ocpp.v21.model.common.enumerations;

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
    Removed("Removed"),

    /**
     * No transaction reservation update status enum type.
     */
    NoTransaction("NoTransaction"),
    ;

    private final String value;

    ReservationUpdateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
