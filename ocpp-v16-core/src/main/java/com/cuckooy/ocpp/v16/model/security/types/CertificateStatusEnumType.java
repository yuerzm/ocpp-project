package com.cuckooy.ocpp.v16.model.security.types;

public enum CertificateStatusEnumType {

    Accepted("Accepted"),
    Failed("Failed"),
    Rejected("Rejected");

    private final String value;

    CertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
