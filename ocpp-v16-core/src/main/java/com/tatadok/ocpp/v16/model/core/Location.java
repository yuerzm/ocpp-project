package com.tatadok.ocpp.v16.model.core;

public enum Location {

    Body("Body"),

    Cable("Cable"),

    EV("EV"),

    Inlet("Inlet"),

    Outlet("Outlet");

    private final String value;

    Location(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
