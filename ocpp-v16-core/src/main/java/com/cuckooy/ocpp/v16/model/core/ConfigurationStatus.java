package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Configuration status.
 */
public enum ConfigurationStatus {

    /**
     * Accepted configuration status.
     */
    Accepted("Accepted"),

    /**
     * Rejected configuration status.
     */
    Rejected("Rejected"),

    /**
     * Reboot required configuration status.
     */
    RebootRequired("RebootRequired"),

    /**
     * Not supported configuration status.
     */
    NotSupported("NotSupported");

    private final String value;

    ConfigurationStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
