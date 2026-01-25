package com.cuckooy.ocpp.v20.model.common.enumerations;

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
