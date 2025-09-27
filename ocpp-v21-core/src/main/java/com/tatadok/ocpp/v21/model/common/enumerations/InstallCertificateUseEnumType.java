package com.tatadok.ocpp.v21.model.common.enumerations;

public enum InstallCertificateUseEnumType {

    V2GRootCertificate("V2GRootCertificate"),
    MORootCertificate("MORootCertificate"),
    CSMSRootCertificate("CSMSRootCertificate"),
    ManufacturerRootCertificate("ManufacturerRootCertificate"),
    OEMRootCertificate("OEMRootCertificate"),
    ;

    private final String value;

    InstallCertificateUseEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
