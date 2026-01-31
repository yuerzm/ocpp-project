package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Mutability enum type.
 */
public enum MutabilityEnumType {

    /**
     * Read only mutability enum type.
     */
    ReadOnly("ReadOnly"),

    /**
     * Write only mutability enum type.
     */
    WriteOnly("WriteOnly"),

    /**
     * Read write mutability enum type.
     */
    ReadWrite("ReadWrite");

    private final String value;

    MutabilityEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
