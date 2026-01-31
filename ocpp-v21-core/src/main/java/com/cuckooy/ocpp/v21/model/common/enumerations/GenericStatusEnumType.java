package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Generic status enum type.
 */
public enum GenericStatusEnumType {

    /**
     * Accepted generic status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected generic status enum type.
     */
    Rejected("Rejected");

    private final String value;

    GenericStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
