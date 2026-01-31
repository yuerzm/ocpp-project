package com.cuckooy.ocpp.v16.model.localauthlist;

/**
 * The enum Update type.
 */
public enum UpdateType {

    /**
     * Differential update type.
     */
    Differential("Differential"),

    /**
     * Full update type.
     */
    Full("Full");

    private final String value;

    UpdateType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
