package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Reset status enum type.
 */
public enum ResetStatusEnumType {

    /**
     * Accepted reset status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected reset status enum type.
     */
    Rejected("Rejected"),

    /**
     * Scheduled reset status enum type.
     */
    Scheduled("Scheduled");

    private final String value;

    ResetStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
