package com.tatadok.ocpp.v21.model.common.enumerations;

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
