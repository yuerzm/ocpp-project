package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum CancelReservationStatusEnumType {

    Accepted("Accepted"),

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
