package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Ocpp version enum type.
 */
public enum OCPPVersionEnumType {

    /**
     * Ocpp 12 ocpp version enum type.
     */
    OCPP12("OCPP12"),
    /**
     * Ocpp 15 ocpp version enum type.
     */
    OCPP15("OCPP15"),
    /**
     * Ocpp 16 ocpp version enum type.
     */
    OCPP16("OCPP16"),
    /**
     * Ocpp 20 ocpp version enum type.
     */
    OCPP20("OCPP20");

    private final String value;

    OCPPVersionEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
