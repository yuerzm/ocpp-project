package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Change availability status enum type.
 */
public enum ChangeAvailabilityStatusEnumType {

    /**
     * Accepted change availability status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected change availability status enum type.
     */
    Rejected("Rejected"),

    /**
     * Scheduled change availability status enum type.
     */
    Scheduled("Scheduled");

    private final String value;

    ChangeAvailabilityStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
