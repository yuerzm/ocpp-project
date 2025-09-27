package com.tatadok.ocpp.v21.model.common.enumerations;

public enum GetVariableStatusEnumType {

    Accepted("Accepted"),

    Rejected("Rejected"),

    UnknownComponent("UnknownComponent"),

    UnknownVariable("UnknownVariable"),

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
