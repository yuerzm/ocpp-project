package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Message state enum type.
 */
public enum MessageStateEnumType {

    /**
     * Charging message state enum type.
     */
    Charging("Charging"),

    /**
     * Faulted message state enum type.
     */
    Faulted("Faulted"),

    /**
     * Idle message state enum type.
     */
    Idle("Idle"),

    /**
     * Unavailable message state enum type.
     */
    Unavailable("Unavailable");

    private final String value;

    MessageStateEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
