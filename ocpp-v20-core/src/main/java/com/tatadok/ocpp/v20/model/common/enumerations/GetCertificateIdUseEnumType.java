package com.tatadok.ocpp.v20.model.common.enumerations;

public enum GetCertificateIdUseEnumType {

    V2GRootCertificate("V2GRootCertificate"),
    MORootCertificate("MORootCertificate"),
    CSMSRootCertificate("CSMSRootCertificate"),
    V2GCertificateChain("V2GCertificateChain"),
    ManufacturerRootCertificate("ManufacturerRootCertificate");

    private final String value;

    GetCertificateIdUseEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
