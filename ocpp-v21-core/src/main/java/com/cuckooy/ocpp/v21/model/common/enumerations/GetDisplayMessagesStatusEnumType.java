package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Get display messages status enum type.
 */
public enum GetDisplayMessagesStatusEnumType {

    /**
     * Accepted get display messages status enum type.
     */
    Accepted("Accepted"),
    /**
     * Unknown get display messages status enum type.
     */
    Unknown("Unknown");

    private final String value;

    GetDisplayMessagesStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
