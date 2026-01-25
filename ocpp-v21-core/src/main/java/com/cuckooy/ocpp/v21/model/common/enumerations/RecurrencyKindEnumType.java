package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum RecurrencyKindEnumType {

    Daily("Daily"),

    Weekly("Weekly");

    private final String value;

    RecurrencyKindEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
