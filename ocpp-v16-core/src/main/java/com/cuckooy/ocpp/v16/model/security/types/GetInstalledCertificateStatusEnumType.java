package com.cuckooy.ocpp.v16.model.security.types;

public enum GetInstalledCertificateStatusEnumType {

    Accepted("Accepted"),
    NotFound("NotFound");

    private final String value;

    GetInstalledCertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
