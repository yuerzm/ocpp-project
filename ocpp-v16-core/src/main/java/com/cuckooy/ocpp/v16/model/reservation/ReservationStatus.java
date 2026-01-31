package com.cuckooy.ocpp.v16.model.reservation;

/**
 * The enum Reservation status.
 */
public enum ReservationStatus {

    /**
     * Accepted reservation status.
     */
    Accepted("Accepted"),

    /**
     * Faulted reservation status.
     */
    Faulted("Faulted"),

    /**
     * Occupied reservation status.
     */
    Occupied("Occupied"),

    /**
     * Rejected reservation status.
     */
    Rejected("Rejected"),

    /**
     * Unavailable reservation status.
     */
    Unavailable("Unavailable");

    private final String value;

    ReservationStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
