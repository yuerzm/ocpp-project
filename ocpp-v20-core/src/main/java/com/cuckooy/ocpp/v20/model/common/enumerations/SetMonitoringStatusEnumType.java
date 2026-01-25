package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum SetMonitoringStatusEnumType {

    Accepted("Accepted"),
    UnknownComponent("UnknownComponent"),
    UnknownVariable("UnknownVariable"),
    UnsupportedMonitorType("UnsupportedMonitorType"),
    Rejected("Rejected"),
    Duplicate("Duplicate");

    private final String value;

    SetMonitoringStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
