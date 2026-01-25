package com.cuckooy.ocpp.v16.model.core;

public enum RecurrencyKindType {

    Daily("Daily"),

    Weekly("Weekly");

    private final String value;

    RecurrencyKindType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
