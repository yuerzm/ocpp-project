package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Data transfer status enum type.
 */
public enum DataTransferStatusEnumType {

    /**
     * Accepted data transfer status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected data transfer status enum type.
     */
    Rejected("Rejected"),

    /**
     * Unknown message id data transfer status enum type.
     */
    UnknownMessageId("UnknownMessageId"),

    /**
     * Unknown vendor id data transfer status enum type.
     */
    UnknownVendorId("UnknownVendorId");

    private final String value;

    DataTransferStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
