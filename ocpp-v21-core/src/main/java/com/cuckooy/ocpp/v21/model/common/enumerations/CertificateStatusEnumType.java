package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum CertificateStatusEnumType {

    Good("Good"),
    Revoked("Revoked"),
    Unknown("Unknown"),
    Failed("Failed"),
    ;

    private final String value;

    CertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
