package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Certificate status enum type.
 */
public enum CertificateStatusEnumType {

    /**
     * Good certificate status enum type.
     */
    Good("Good"),
    /**
     * Revoked certificate status enum type.
     */
    Revoked("Revoked"),
    /**
     * Unknown certificate status enum type.
     */
    Unknown("Unknown"),
    /**
     * Failed certificate status enum type.
     */
    Failed("Failed"),
    ;

    private final String value;

    CertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
