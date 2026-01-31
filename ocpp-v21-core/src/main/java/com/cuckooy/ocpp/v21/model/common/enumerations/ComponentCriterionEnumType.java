package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Component criterion enum type.
 */
public enum ComponentCriterionEnumType {

    /**
     * Active component criterion enum type.
     */
    Active("Active"),

    /**
     * Available component criterion enum type.
     */
    Available("Available"),

    /**
     * Enabled component criterion enum type.
     */
    Enabled("Enabled"),

    /**
     * Problem component criterion enum type.
     */
    Problem("Problem");

    private final String value;

    ComponentCriterionEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
