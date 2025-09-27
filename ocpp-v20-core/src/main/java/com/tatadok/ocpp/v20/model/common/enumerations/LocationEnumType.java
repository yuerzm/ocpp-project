package com.tatadok.ocpp.v20.model.common.enumerations;

public enum LocationEnumType {

    Cable("Cable"),

    EV("EV"),

    Inlet("Inlet"),

    Outlet("Outlet"),

    Body("Body");

    private final String value;

    LocationEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
