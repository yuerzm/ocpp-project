package com.tatadok.ocpp.v16.model.localauthlist;

public enum UpdateStatus {

    Accepted("Accepted"),

    Failed("Failed"),

    NotSupported("NotSupported"),

    VersionMismatch("VersionMismatch");

    private final String value;

    UpdateStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
