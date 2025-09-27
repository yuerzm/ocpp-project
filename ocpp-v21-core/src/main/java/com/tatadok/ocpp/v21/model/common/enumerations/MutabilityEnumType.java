package com.tatadok.ocpp.v21.model.common.enumerations;

public enum MutabilityEnumType {

    ReadOnly("ReadOnly"),

    WriteOnly("WriteOnly"),

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
