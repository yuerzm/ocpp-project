package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Remote start stop status.
 */
public enum RemoteStartStopStatus {

    /**
     * Accepted remote start stop status.
     */
    Accepted("Accepted"),

    /**
     * Rejected remote start stop status.
     */
    Rejected("Rejected");

    private final String value;

    RemoteStartStopStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
