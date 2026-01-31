package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Certificate action enum type.
 */
public enum CertificateActionEnumType {

    /**
     * Install certificate action enum type.
     */
    Install("Install"),
    /**
     * Update certificate action enum type.
     */
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
