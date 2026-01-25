package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum GenericDeviceModelStatusEnumType {

    Accepted("Accepted"),

    Rejected("Rejected"),

    NotSupported("NotSupported"),

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
