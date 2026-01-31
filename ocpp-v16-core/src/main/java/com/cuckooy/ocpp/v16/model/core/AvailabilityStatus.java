package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Availability status.
 */
public enum AvailabilityStatus {

    /**
     * Accepted availability status.
     */
    Accepted("Accepted"),

    /**
     * Rejected availability status.
     */
    Rejected("Rejected"),

    /**
     * Scheduled availability status.
     */
    Scheduled("Scheduled");

    private final String value;

    AvailabilityStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}