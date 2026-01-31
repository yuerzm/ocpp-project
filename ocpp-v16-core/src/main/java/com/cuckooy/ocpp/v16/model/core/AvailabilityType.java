package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Availability type.
 */
public enum AvailabilityType {

    /**
     * Inoperative availability type.
     */
    Inoperative("Inoperative"),

    /**
     * Operative availability type.
     */
    Operative("Operative");

    private final String value;

    AvailabilityType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }


}