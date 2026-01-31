package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Evse kind enum type.
 */
public enum EvseKindEnumType {

    /**
     * Ac evse kind enum type.
     */
    AC("AC"),
    /**
     * Dc evse kind enum type.
     */
    DC("DC"),
    ;

    private final String value;

    EvseKindEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
