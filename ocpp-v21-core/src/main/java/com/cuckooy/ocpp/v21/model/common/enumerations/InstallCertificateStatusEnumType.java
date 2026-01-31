package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Install certificate status enum type.
 */
public enum InstallCertificateStatusEnumType {

    /**
     * Accepted install certificate status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected install certificate status enum type.
     */
    Rejected("Rejected"),
    /**
     * Failed install certificate status enum type.
     */
    Failed("Failed");

    private final String value;

    InstallCertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
