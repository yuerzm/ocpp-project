package com.tatadok.ocpp.v21.model.common.enumerations;

public enum CertificateStatusSourceEnumType {

    CRL("CRL"),
    OCSP("OCSP"),
    ;

    private final String value;

    CertificateStatusSourceEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
