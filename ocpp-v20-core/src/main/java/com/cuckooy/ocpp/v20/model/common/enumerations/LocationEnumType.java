package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Location enum type.
 */
public enum LocationEnumType {

    /**
     * Cable location enum type.
     */
    Cable("Cable"),

    /**
     * Ev location enum type.
     */
    EV("EV"),

    /**
     * Inlet location enum type.
     */
    Inlet("Inlet"),

    /**
     * Outlet location enum type.
     */
    Outlet("Outlet"),

    /**
     * Body location enum type.
     */
    Body("Body");

    private final String value;

    LocationEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
