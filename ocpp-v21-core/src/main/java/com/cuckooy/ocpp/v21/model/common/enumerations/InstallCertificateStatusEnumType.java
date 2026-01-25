package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum InstallCertificateStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    Failed("Failed");

    private final String value;

    InstallCertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
