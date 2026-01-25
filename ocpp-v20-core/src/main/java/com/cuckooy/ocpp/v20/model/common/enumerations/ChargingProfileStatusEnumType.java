package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum ChargingProfileStatusEnumType {

    Accepted("Accepted"),

    Rejected("Rejected");

    private final String value;

    ChargingProfileStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
