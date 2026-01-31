package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Data transfer status.
 */
public enum DataTransferStatus {

    /**
     * Accepted data transfer status.
     */
    Accepted("Accepted"),

    /**
     * Rejected data transfer status.
     */
    Rejected("Rejected"),

    /**
     * Unknown message id data transfer status.
     */
    UnknownMessageId("UnknownMessageId"),

    /**
     * Unknown vendor id data transfer status.
     */
    UnknownVendorId("UnknownVendorId");

    private final String value;

    DataTransferStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
