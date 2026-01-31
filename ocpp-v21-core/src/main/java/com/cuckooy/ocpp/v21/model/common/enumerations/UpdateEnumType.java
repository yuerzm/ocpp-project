package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Update enum type.
 */
public enum UpdateEnumType {

    /**
     * Differential update enum type.
     */
    Differential("Differential"),

    /**
     * Full update enum type.
     */
    Full("Full");

    private final String value;

    UpdateEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
