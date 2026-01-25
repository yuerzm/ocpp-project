package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum Iso15118EVCertificateStatusEnumType {

    Accepted("Accepted"),
    Failed("Failed");

    private final String value;

    Iso15118EVCertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
