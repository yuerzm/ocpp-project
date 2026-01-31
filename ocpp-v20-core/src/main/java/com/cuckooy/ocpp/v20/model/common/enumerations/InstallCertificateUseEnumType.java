package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Install certificate use enum type.
 */
public enum InstallCertificateUseEnumType {

    /**
     * V 2 g root certificate install certificate use enum type.
     */
    V2GRootCertificate("V2GRootCertificate"),
    /**
     * Mo root certificate install certificate use enum type.
     */
    MORootCertificate("MORootCertificate"),
    /**
     * Csms root certificate install certificate use enum type.
     */
    CSMSRootCertificate("CSMSRootCertificate"),
    /**
     * Manufacturer root certificate install certificate use enum type.
     */
    ManufacturerRootCertificate("ManufacturerRootCertificate");

    private final String value;

    InstallCertificateUseEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
