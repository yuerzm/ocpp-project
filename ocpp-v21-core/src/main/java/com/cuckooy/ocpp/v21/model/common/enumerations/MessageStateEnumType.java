package com.cuckooy.ocpp.v21.model.common.enumerations;

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
    Unavailable("Unavailable"),
    /**
     * Suspended message state enum type.
     */
    Suspended("Suspended"),
    /**
     * Discharging message state enum type.
     */
    Discharging("Discharging"),
    ;

    private final String value;

    MessageStateEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
