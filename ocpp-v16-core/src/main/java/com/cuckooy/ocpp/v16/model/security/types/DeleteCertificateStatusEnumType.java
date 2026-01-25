package com.cuckooy.ocpp.v16.model.security.types;

public enum DeleteCertificateStatusEnumType {

    Accepted("Accepted"),
    Failed("Failed"),
    NotFound("NotFound");

    private final String value;

    DeleteCertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
