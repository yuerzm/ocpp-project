package com.tatadok.ocpp.v20.model.common.enumerations;

public enum ReservationUpdateStatusEnumType {

    Expired("Expired"),

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
