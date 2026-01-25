package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum ResetEnumType {

    Immediate("Immediate"),

    OnIdle("OnIdle");

    private final String value;

    ResetEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
