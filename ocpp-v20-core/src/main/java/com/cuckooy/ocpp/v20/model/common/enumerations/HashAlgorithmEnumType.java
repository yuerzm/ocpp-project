package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Hash algorithm enum type.
 */
public enum HashAlgorithmEnumType {

    /**
     * Sha 256 hash algorithm enum type.
     */
    SHA256("SHA256"),
    /**
     * Sha 384 hash algorithm enum type.
     */
    SHA384("SHA384"),
    /**
     * Sha 512 hash algorithm enum type.
     */
    SHA512("SHA512");

    private final String value;

    HashAlgorithmEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
