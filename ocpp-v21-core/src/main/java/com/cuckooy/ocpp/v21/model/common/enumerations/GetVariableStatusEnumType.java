package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Get variable status enum type.
 */
public enum GetVariableStatusEnumType {

    /**
     * Accepted get variable status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected get variable status enum type.
     */
    Rejected("Rejected"),

    /**
     * Unknown component get variable status enum type.
     */
    UnknownComponent("UnknownComponent"),

    /**
     * Unknown variable get variable status enum type.
     */
    UnknownVariable("UnknownVariable"),

    /**
     * Not supported attribute type get variable status enum type.
     */
    NotSupportedAttributeType("NotSupportedAttributeType");

    private final String value;

    GetVariableStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
