package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Clear cache status.
 */
public enum ClearCacheStatus {

    /**
     * Accepted clear cache status.
     */
    Accepted("Accepted"),

    /**
     * Rejected clear cache status.
     */
    Rejected("Rejected");

    private final String value;

    ClearCacheStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}