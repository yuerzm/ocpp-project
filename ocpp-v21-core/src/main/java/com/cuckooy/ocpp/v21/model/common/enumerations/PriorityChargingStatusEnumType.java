package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum PriorityChargingStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    NoProfile("NoProfile"),
    ;

    private final String value;

    PriorityChargingStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
