package com.cuckooy.ocpp.v16.model.reservation;

public enum ReservationStatus {

    Accepted("Accepted"),

    Faulted("Faulted"),

    Occupied("Occupied"),

    Rejected("Rejected"),

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
