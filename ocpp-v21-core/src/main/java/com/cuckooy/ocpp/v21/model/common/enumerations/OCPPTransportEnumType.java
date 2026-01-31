package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Ocpp transport enum type.
 */
public enum OCPPTransportEnumType {

    /**
     * Json ocpp transport enum type.
     */
    JSON("JSON"),
    /**
     * Soap ocpp transport enum type.
     */
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
