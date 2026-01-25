package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum NotifyEVChargingNeedsStatusEnumType {

    Accepted("Accepted"),

    Rejected("Rejected"),

    Processing("Processing"),

    NoChargingProfile("NoChargingProfile"),
    ;

    private final String value;

    NotifyEVChargingNeedsStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
