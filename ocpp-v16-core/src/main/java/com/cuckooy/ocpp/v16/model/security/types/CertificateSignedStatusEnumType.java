package com.cuckooy.ocpp.v16.model.security.types;

/**
 * The enum Certificate signed status enum type.
 */
public enum CertificateSignedStatusEnumType {

    /**
     * Accepted certificate signed status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected certificate signed status enum type.
     */
    Rejected("Rejected");

    private final String value;

    CertificateSignedStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
