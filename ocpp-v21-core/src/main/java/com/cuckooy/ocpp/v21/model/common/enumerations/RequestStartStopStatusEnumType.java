package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum RequestStartStopStatusEnumType {

    Accepted("Accepted"),

    Rejected("Rejected");

    private final String value;

    RequestStartStopStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
