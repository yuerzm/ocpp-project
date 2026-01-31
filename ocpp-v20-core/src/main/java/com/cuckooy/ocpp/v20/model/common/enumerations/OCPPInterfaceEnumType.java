package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Ocpp interface enum type.
 */
public enum OCPPInterfaceEnumType {

    /**
     * Wired 0 ocpp interface enum type.
     */
    Wired0("Wired0"),
    /**
     * Wired 1 ocpp interface enum type.
     */
    Wired1("Wired1"),
    /**
     * Wired 2 ocpp interface enum type.
     */
    Wired2("Wired2"),
    /**
     * Wired 3 ocpp interface enum type.
     */
    Wired3("Wired3"),
    /**
     * Wireless 0 ocpp interface enum type.
     */
    Wireless0("Wireless0"),
    /**
     * Wireless 1 ocpp interface enum type.
     */
    Wireless1("Wireless1"),
    /**
     * Wireless 2 ocpp interface enum type.
     */
    Wireless2("Wireless2"),
    /**
     * Wireless 3 ocpp interface enum type.
     */
    Wireless3("Wireless3");

    private final String value;

    OCPPInterfaceEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
