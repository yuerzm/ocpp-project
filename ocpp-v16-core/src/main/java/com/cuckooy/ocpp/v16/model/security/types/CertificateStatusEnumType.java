package com.cuckooy.ocpp.v16.model.security.types;

/**
 * The enum Certificate status enum type.
 */
public enum CertificateStatusEnumType {

    /**
     * Accepted certificate status enum type.
     */
    Accepted("Accepted"),
    /**
     * Failed certificate status enum type.
     */
    Failed("Failed"),
    /**
     * Rejected certificate status enum type.
     */
    Rejected("Rejected");

    private final String value;

    CertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
