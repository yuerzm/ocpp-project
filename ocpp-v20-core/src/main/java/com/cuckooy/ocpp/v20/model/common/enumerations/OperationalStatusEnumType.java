package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum OperationalStatusEnumType {

    Inoperative("Inoperative"),

    Operative("Operative");

    private final String value;

    OperationalStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
