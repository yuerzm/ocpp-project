package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum ConnectorStatusEnumType {

    Available("Available"),
    Occupied("Occupied"),
    Reserved("Reserved"),
    Unavailable("Unavailable"),
    Faulted("Faulted");

    private final String value;

    ConnectorStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
