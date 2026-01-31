package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Get certificate id use enum type.
 */
public enum GetCertificateIdUseEnumType {

    /**
     * V 2 g root certificate get certificate id use enum type.
     */
    V2GRootCertificate("V2GRootCertificate"),
    /**
     * Mo root certificate get certificate id use enum type.
     */
    MORootCertificate("MORootCertificate"),
    /**
     * Csms root certificate get certificate id use enum type.
     */
    CSMSRootCertificate("CSMSRootCertificate"),
    /**
     * V 2 g certificate chain get certificate id use enum type.
     */
    V2GCertificateChain("V2GCertificateChain"),
    /**
     * Manufacturer root certificate get certificate id use enum type.
     */
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
