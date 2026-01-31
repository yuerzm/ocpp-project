package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Authorize certificate status enum type.
 */
public enum AuthorizeCertificateStatusEnumType {

    /**
     * Accepted authorize certificate status enum type.
     */
    Accepted("Accepted"),
    /**
     * Signature error authorize certificate status enum type.
     */
    SignatureError("SignatureError"),
    /**
     * Certificate expired authorize certificate status enum type.
     */
    CertificateExpired("CertificateExpired"),
    /**
     * Certificate revoked authorize certificate status enum type.
     */
    CertificateRevoked("CertificateRevoked"),
    /**
     * No certificate available authorize certificate status enum type.
     */
    NoCertificateAvailable("NoCertificateAvailable"),
    /**
     * Cert chain error authorize certificate status enum type.
     */
    CertChainError("CertChainError"),
    /**
     * Contract cancelled authorize certificate status enum type.
     */
    ContractCancelled("ContractCancelled");

    private final String value;

    AuthorizeCertificateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
