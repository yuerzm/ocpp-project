package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Registration status enum type.
 */
public enum RegistrationStatusEnumType {

    /**
     * Accepted registration status enum type.
     */
    Accepted("Accepted"),

    /**
     * Pending registration status enum type.
     */
    Pending("Pending"),

    /**
     * Rejected registration status enum type.
     */
    Rejected("Rejected");

    private final String value;

    RegistrationStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
