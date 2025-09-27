package com.tatadok.ocpp.v16.model.reservation;

public enum CancelReservationStatus {

    Accepted("Accepted"),

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