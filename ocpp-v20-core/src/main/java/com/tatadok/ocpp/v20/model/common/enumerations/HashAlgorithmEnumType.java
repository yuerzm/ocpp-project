package com.tatadok.ocpp.v20.model.common.enumerations;

public enum HashAlgorithmEnumType {

    SHA256("SHA256"),
    SHA384("SHA384"),
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
