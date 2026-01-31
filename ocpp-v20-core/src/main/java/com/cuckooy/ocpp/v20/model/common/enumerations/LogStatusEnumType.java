package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Log status enum type.
 */
public enum LogStatusEnumType {

    /**
     * Accepted log status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected log status enum type.
     */
    Rejected("Rejected"),

    /**
     * Accepted canceled log status enum type.
     */
    AcceptedCanceled("AcceptedCanceled");

    private final String value;

    LogStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
