package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Certificate status source enum type.
 */
public enum CertificateStatusSourceEnumType {

    /**
     * Crl certificate status source enum type.
     */
    CRL("CRL"),
    /**
     * Ocsp certificate status source enum type.
     */
    OCSP("OCSP"),
    ;

    private final String value;

    CertificateStatusSourceEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
