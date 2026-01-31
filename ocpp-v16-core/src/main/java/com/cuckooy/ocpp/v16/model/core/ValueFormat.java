package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Value format.
 */
public enum ValueFormat {

    /**
     * Raw value format.
     */
    Raw("Raw"),

    /**
     * Signed data value format.
     */
    SignedData("SignedData");

    private final String value;

    ValueFormat(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}