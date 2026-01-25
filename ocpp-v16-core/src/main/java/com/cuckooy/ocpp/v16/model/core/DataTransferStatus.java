package com.cuckooy.ocpp.v16.model.core;

public enum DataTransferStatus {

    Accepted("Accepted"),

    Rejected("Rejected"),

    UnknownMessageId("UnknownMessageId"),

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
