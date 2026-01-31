package com.cuckooy.ocpp.v16.model.localauthlist;

/**
 * The enum Update status.
 */
public enum UpdateStatus {

    /**
     * Accepted update status.
     */
    Accepted("Accepted"),

    /**
     * Failed update status.
     */
    Failed("Failed"),

    /**
     * Not supported update status.
     */
    NotSupported("NotSupported"),

    /**
     * Version mismatch update status.
     */
    VersionMismatch("VersionMismatch");

    private final String value;

    UpdateStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
