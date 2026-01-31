package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Attribute enum type.
 */
public enum AttributeEnumType {

    /**
     * Actual attribute enum type.
     */
    Actual("Actual"),

    /**
     * Target attribute enum type.
     */
    Target("Target"),

    /**
     * Min set attribute enum type.
     */
    MinSet("MinSet"),

    /**
     * Max set attribute enum type.
     */
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
