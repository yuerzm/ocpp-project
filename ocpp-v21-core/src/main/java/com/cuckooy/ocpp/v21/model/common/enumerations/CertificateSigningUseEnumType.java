package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Certificate signing use enum type.
 */
public enum CertificateSigningUseEnumType {

    /**
     * Charging station certificate certificate signing use enum type.
     */
    ChargingStationCertificate("ChargingStationCertificate"),

    /**
     * V 2 g certificate certificate signing use enum type.
     */
    V2GCertificate("V2GCertificate"),

    /**
     * V 2 g 20 certificate certificate signing use enum type.
     */
    V2G20Certificate("V2G20Certificate");

    private final String value;

    CertificateSigningUseEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
