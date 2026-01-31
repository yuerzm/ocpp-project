package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Reset enum type.
 */
public enum ResetEnumType {

    /**
     * Immediate reset enum type.
     */
    Immediate("Immediate"),

    /**
     * On idle reset enum type.
     */
    OnIdle("OnIdle");

    private final String value;

    ResetEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
