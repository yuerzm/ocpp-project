package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Control mode enum type.
 */
public enum ControlModeEnumType {

    /**
     * Scheduled control control mode enum type.
     */
    ScheduledControl("ScheduledControl"),
    /**
     * Dynamic control control mode enum type.
     */
    DynamicControl("DynamicControl"),
    ;

    private final String value;

    ControlModeEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
