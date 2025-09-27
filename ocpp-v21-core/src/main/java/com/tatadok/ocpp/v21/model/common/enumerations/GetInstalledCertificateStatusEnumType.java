package com.tatadok.ocpp.v21.model.common.enumerations;

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
