package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Location.
 */
public enum Location {

    /**
     * Body location.
     */
    Body("Body"),

    /**
     * Cable location.
     */
    Cable("Cable"),

    /**
     * Ev location.
     */
    EV("EV"),

    /**
     * Inlet location.
     */
    Inlet("Inlet"),

    /**
     * Outlet location.
     */
    Outlet("Outlet");

    private final String value;

    Location(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
