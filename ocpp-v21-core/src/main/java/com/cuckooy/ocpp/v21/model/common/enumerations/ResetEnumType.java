package com.cuckooy.ocpp.v21.model.common.enumerations;

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
    OnIdle("OnIdle"),

    /**
     * Immediate and resume reset enum type.
     */
    ImmediateAndResume("ImmediateAndResume"),
    ;

    private final String value;

    ResetEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
