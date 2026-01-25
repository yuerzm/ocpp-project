package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum ClearMonitoringStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    NotFound("NotFound");

    private final String value;

    ClearMonitoringStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
