package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Recurrency kind enum type.
 */
public enum RecurrencyKindEnumType {

    /**
     * Daily recurrency kind enum type.
     */
    Daily("Daily"),

    /**
     * Weekly recurrency kind enum type.
     */
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
