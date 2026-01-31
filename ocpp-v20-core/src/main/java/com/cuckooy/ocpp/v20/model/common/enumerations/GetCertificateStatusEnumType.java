package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Get certificate status enum type.
 */
public enum GetCertificateStatusEnumType {

    /**
     * Accepted get certificate status enum type.
     */
    Accepted("Accepted"),

    /**
     * Failed get certificate status enum type.
     */
    Failed("Failed");

    private final String value;

    GetCertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
