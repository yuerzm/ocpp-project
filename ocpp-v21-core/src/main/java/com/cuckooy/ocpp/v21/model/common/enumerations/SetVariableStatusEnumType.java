package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Set variable status enum type.
 */
public enum SetVariableStatusEnumType {

    /**
     * Accepted set variable status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected set variable status enum type.
     */
    Rejected("Rejected"),

    /**
     * Unknown component set variable status enum type.
     */
    UnknownComponent("UnknownComponent"),

    /**
     * Unknown variable set variable status enum type.
     */
    UnknownVariable("UnknownVariable"),

    /**
     * Not supported attribute type set variable status enum type.
     */
    NotSupportedAttributeType("NotSupportedAttributeType"),

    /**
     * Reboot required set variable status enum type.
     */
    RebootRequired("RebootRequired");

    private final String value;

    SetVariableStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
