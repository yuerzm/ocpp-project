package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Operational status enum type.
 */
public enum OperationalStatusEnumType {

    /**
     * Inoperative operational status enum type.
     */
    Inoperative("Inoperative"),

    /**
     * Operative operational status enum type.
     */
    Operative("Operative");

    private final String value;

    OperationalStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
