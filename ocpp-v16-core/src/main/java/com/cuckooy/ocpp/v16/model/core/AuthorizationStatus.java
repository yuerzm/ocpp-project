package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Authorization status.
 */
public enum AuthorizationStatus {

    /**
     * Accepted authorization status.
     */
    Accepted("Accepted"),

    /**
     * Blocked authorization status.
     */
    Blocked("Blocked"),

    /**
     * Expired authorization status.
     */
    Expired("Expired"),

    /**
     * Invalid authorization status.
     */
    Invalid("Invalid"),

    /**
     * Concurrent tx authorization status.
     */
    ConcurrentTx("ConcurrentTx");

    private final String value;

    AuthorizationStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}