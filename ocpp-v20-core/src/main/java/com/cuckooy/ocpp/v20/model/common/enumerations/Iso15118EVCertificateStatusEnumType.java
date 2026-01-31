package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Iso 15118 ev certificate status enum type.
 */
public enum Iso15118EVCertificateStatusEnumType {

    /**
     * Accepted iso 15118 ev certificate status enum type.
     */
    Accepted("Accepted"),
    /**
     * Failed iso 15118 ev certificate status enum type.
     */
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
