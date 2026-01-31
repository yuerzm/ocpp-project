package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Recurrency kind type.
 */
public enum RecurrencyKindType {

    /**
     * Daily recurrency kind type.
     */
    Daily("Daily"),

    /**
     * Weekly recurrency kind type.
     */
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
