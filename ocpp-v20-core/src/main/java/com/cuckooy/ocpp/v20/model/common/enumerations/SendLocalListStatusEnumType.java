package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Send local list status enum type.
 */
public enum SendLocalListStatusEnumType {

    /**
     * Accepted send local list status enum type.
     */
    Accepted("Accepted"),

    /**
     * Failed send local list status enum type.
     */
    Failed("Failed"),

    /**
     * Version mismatch send local list status enum type.
     */
    VersionMismatch("VersionMismatch");

    private final String value;

    SendLocalListStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
