package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum NotifyEVChargingNeedsStatusEnumType {

    Accepted("Accepted"),

    Rejected("Rejected"),

    Processing("Processing");

    private final String value;

    NotifyEVChargingNeedsStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
