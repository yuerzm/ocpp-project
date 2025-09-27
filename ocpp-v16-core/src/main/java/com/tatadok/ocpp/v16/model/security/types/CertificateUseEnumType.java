package com.tatadok.ocpp.v16.model.security.types;

public enum CertificateUseEnumType {

    CentralSystemRootCertificate("CentralSystemRootCertificate"),
    ManufacturerRootCertificate("ManufacturerRootCertificate");

    private final String value;

    CertificateUseEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
