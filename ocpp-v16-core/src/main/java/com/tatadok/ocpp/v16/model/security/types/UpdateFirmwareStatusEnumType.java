package com.tatadok.ocpp.v16.model.security.types;

public enum UpdateFirmwareStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    AcceptedCanceled("AcceptedCanceled"),
    InvalidCertificate("InvalidCertificate"),
    RevokedCertificate("RevokedCertificate");

    private final String value;

    UpdateFirmwareStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
