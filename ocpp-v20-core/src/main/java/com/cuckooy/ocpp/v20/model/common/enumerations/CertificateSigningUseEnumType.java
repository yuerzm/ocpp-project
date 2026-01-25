package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum CertificateSigningUseEnumType {

    ChargingStationCertificate("ChargingStationCertificate"),

    V2GCertificate("V2GCertificate");

    private final String value;

    CertificateSigningUseEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
