package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Registration status.
 */
public enum RegistrationStatus {

    /**
     * Accepted registration status.
     */
    Accepted("Accepted"),

    /**
     * Pending registration status.
     */
    Pending("Pending"),

    /**
     * Rejected registration status.
     */
    Rejected("Rejected");

    private final String value;

    RegistrationStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
