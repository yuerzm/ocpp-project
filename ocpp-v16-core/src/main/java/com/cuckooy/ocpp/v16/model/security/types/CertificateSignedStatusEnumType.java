package com.cuckooy.ocpp.v16.model.security.types;

public enum CertificateSignedStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected");

    private final String value;

    CertificateSignedStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
