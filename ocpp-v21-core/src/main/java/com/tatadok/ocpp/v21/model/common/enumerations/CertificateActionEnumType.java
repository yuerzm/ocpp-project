package com.tatadok.ocpp.v21.model.common.enumerations;

public enum CertificateActionEnumType {

    Install("Install"),
    Update("Update");

    private final String value;

    CertificateActionEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
