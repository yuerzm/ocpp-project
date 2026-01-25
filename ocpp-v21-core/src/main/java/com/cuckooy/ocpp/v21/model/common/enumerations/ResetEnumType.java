package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum ResetEnumType {

    Immediate("Immediate"),

    OnIdle("OnIdle"),

    ImmediateAndResume("ImmediateAndResume"),
    ;

    private final String value;

    ResetEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
