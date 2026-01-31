package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Clear cache status enum type.
 */
public enum ClearCacheStatusEnumType {

    /**
     * Accepted clear cache status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected clear cache status enum type.
     */
    Rejected("Rejected");

    private final String value;

    ClearCacheStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
