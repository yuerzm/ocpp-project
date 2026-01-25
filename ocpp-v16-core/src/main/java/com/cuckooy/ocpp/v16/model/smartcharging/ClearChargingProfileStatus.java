package com.cuckooy.ocpp.v16.model.smartcharging;

public enum ClearChargingProfileStatus {

    Accepted("Accepted"),

    Unknown("Unknown");

    private final String value;

    ClearChargingProfileStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}