package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum EventTriggerEnumType {

    Alerting("Alerting"),

    Delta("Delta"),

    Periodic("Periodic");

    private final String value;

    EventTriggerEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
