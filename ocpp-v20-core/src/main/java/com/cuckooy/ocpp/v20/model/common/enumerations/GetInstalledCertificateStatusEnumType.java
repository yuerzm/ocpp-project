package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Get installed certificate status enum type.
 */
public enum GetInstalledCertificateStatusEnumType {

    /**
     * Accepted get installed certificate status enum type.
     */
    Accepted("Accepted"),
    /**
     * Not found get installed certificate status enum type.
     */
    NotFound("NotFound");

    private final String value;

    GetInstalledCertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
