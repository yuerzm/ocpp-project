package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Reset type.
 */
public enum ResetType {

    /**
     * Hard reset type.
     */
    Hard("Hard"),

    /**
     * Soft reset type.
     */
    Soft("Soft");

    private final String value;

    ResetType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
