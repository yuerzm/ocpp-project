package com.tatadok.ocpp.v16.model.core;

public enum ConfigurationStatus {

    Accepted("Accepted"),

    Rejected("Rejected"),

    RebootRequired("RebootRequired"),

    NotSupported("NotSupported");

    private final String value;

    ConfigurationStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
