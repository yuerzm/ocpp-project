package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Reset status.
 */
public enum ResetStatus {

    /**
     * Accepted reset status.
     */
    Accepted("Accepted"),

    /**
     * Rejected reset status.
     */
    Rejected("Rejected");

    private final String value;

    ResetStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
