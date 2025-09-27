package com.tatadok.ocpp.v21.model.common.enumerations;

public enum GetCertificateStatusEnumType {

    Accepted("Accepted"),

    Failed("Failed");

    private final String value;

    GetCertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
