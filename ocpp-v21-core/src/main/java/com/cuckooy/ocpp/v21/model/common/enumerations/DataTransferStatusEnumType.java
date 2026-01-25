package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum DataTransferStatusEnumType {

    Accepted("Accepted"),

    Rejected("Rejected"),

    UnknownMessageId("UnknownMessageId"),

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
