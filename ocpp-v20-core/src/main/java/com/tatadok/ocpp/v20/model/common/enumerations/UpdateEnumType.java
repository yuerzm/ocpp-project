package com.tatadok.ocpp.v20.model.common.enumerations;

public enum UpdateEnumType {

    Differential("Differential"),

    Full("Full");

    private final String value;

    UpdateEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
