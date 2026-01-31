package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Clear message status enum type.
 */
public enum ClearMessageStatusEnumType {

    /**
     * Accepted clear message status enum type.
     */
    Accepted("Accepted"),

    /**
     * Unknown clear message status enum type.
     */
    Unknown("Unknown"),

    /**
     * Rejected clear message status enum type.
     */
    Rejected("Rejected"),
    ;

    private final String value;

    ClearMessageStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
