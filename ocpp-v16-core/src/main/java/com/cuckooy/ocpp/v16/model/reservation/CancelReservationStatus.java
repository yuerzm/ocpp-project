package com.cuckooy.ocpp.v16.model.reservation;

/**
 * The enum Cancel reservation status.
 */
public enum CancelReservationStatus {

    /**
     * Accepted cancel reservation status.
     */
    Accepted("Accepted"),

    /**
     * Rejected cancel reservation status.
     */
    Rejected("Rejected");

    private final String value;

    CancelReservationStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}