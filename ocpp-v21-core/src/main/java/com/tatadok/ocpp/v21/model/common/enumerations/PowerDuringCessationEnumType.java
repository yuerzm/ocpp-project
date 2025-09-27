package com.tatadok.ocpp.v21.model.common.enumerations;

public enum PowerDuringCessationEnumType {

    Active("Active"),
    Reactive("Reactive"),
    ;

    private final String value;

    PowerDuringCessationEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
