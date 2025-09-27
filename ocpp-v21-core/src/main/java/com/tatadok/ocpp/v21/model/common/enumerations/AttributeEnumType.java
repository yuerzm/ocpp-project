package com.tatadok.ocpp.v21.model.common.enumerations;

public enum AttributeEnumType {

    Actual("Actual"),

    Target("Target"),

    MinSet("MinSet"),

    MaxSet("MaxSet");

    private final String value;

    AttributeEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
