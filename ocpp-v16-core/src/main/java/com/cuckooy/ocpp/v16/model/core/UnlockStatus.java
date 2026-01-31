package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Unlock status.
 */
public enum UnlockStatus {

    /**
     * Unlocked unlock status.
     */
    Unlocked("Unlocked"),

    /**
     * Unlock failed unlock status.
     */
    UnlockFailed("UnlockFailed"),

    /**
     * Not supported unlock status.
     */
    NotSupported("NotSupported");

    private final String value;

    UnlockStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
