package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum CustomerInformationStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    Invalid("Invalid");

    private final String value;

    CustomerInformationStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
