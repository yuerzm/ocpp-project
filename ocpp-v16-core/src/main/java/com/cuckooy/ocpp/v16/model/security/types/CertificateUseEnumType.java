package com.cuckooy.ocpp.v16.model.security.types;

/**
 * The enum Certificate use enum type.
 */
public enum CertificateUseEnumType {

    /**
     * Central system root certificate certificate use enum type.
     */
    CentralSystemRootCertificate("CentralSystemRootCertificate"),
    /**
     * Manufacturer root certificate certificate use enum type.
     */
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
