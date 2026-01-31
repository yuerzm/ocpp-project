package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Generic device model status enum type.
 */
public enum GenericDeviceModelStatusEnumType {

    /**
     * Accepted generic device model status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected generic device model status enum type.
     */
    Rejected("Rejected"),

    /**
     * Not supported generic device model status enum type.
     */
    NotSupported("NotSupported"),

    /**
     * Empty result set generic device model status enum type.
     */
    EmptyResultSet("EmptyResultSet");

    private final String value;

    GenericDeviceModelStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
