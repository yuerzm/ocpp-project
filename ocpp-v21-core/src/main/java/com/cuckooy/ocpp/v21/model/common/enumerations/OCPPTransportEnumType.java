package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum OCPPTransportEnumType {

    JSON("JSON"),
    SOAP("SOAP");

    private final String value;

    OCPPTransportEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
