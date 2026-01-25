package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum CertificateSigningUseEnumType {

    ChargingStationCertificate("ChargingStationCertificate"),

    V2GCertificate("V2GCertificate"),

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
