package com.cuckooy.ocpp.v16.model.security.types;

/**
 * The enum Delete certificate status enum type.
 */
public enum DeleteCertificateStatusEnumType {

    /**
     * Accepted delete certificate status enum type.
     */
    Accepted("Accepted"),
    /**
     * Failed delete certificate status enum type.
     */
    Failed("Failed"),
    /**
     * Not found delete certificate status enum type.
     */
    NotFound("NotFound");

    private final String value;

    DeleteCertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
