package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum GetChargingProfileStatusEnumType {

    Accepted("Accepted"),
    NoProfiles("NoProfiles");

    private final String value;

    GetChargingProfileStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
