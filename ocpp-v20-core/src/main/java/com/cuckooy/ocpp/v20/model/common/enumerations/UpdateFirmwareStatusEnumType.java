package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Update firmware status enum type.
 */
public enum UpdateFirmwareStatusEnumType {

    /**
     * Accepted update firmware status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected update firmware status enum type.
     */
    Rejected("Rejected"),

    /**
     * Accepted canceled update firmware status enum type.
     */
    AcceptedCanceled("AcceptedCanceled"),

    /**
     * Invalid certificate update firmware status enum type.
     */
    InvalidCertificate("InvalidCertificate"),

    /**
     * Revoked certificate update firmware status enum type.
     */
    RevokedCertificate("RevokedCertificate");

    private final String value;

    UpdateFirmwareStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
