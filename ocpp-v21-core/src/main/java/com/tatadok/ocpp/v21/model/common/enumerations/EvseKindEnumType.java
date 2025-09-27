package com.tatadok.ocpp.v21.model.common.enumerations;

public enum EvseKindEnumType {

    AC("AC"),
    DC("DC"),
    ;

    private final String value;

    EvseKindEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
