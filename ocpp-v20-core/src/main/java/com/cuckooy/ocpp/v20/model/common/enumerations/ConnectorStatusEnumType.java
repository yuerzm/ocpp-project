package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Connector status enum type.
 */
public enum ConnectorStatusEnumType {

    /**
     * Available connector status enum type.
     */
    Available("Available"),
    /**
     * Occupied connector status enum type.
     */
    Occupied("Occupied"),
    /**
     * Reserved connector status enum type.
     */
    Reserved("Reserved"),
    /**
     * Unavailable connector status enum type.
     */
    Unavailable("Unavailable"),
    /**
     * Faulted connector status enum type.
     */
    Faulted("Faulted");

    private final String value;

    ConnectorStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
