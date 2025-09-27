package com.tatadok.ocpp.v21.model.common.enumerations;

public enum SetNetworkProfileStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    Failed("Failed");

    private final String value;

    SetNetworkProfileStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
