package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum SetVariableStatusEnumType {

    Accepted("Accepted"),

    Rejected("Rejected"),

    UnknownComponent("UnknownComponent"),

    UnknownVariable("UnknownVariable"),

    NotSupportedAttributeType("NotSupportedAttributeType"),

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
