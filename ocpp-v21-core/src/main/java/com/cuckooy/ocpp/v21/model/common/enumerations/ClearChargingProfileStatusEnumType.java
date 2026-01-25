package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum ClearChargingProfileStatusEnumType {

    Accepted("Accepted"),

    Unknown("Unknown");

    private final String value;

    ClearChargingProfileStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
