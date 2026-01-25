package com.cuckooy.ocpp.v20.model.common.enumerations;

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
