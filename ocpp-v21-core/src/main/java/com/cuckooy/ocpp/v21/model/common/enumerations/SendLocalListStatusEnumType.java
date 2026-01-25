package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum SendLocalListStatusEnumType {

    Accepted("Accepted"),

    Failed("Failed"),

    VersionMismatch("VersionMismatch");

    private final String value;

    SendLocalListStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
