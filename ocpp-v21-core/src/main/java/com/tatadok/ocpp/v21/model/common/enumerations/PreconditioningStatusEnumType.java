package com.tatadok.ocpp.v21.model.common.enumerations;

public enum PreconditioningStatusEnumType {

    Unknown("Unknown"),
    Ready("Ready"),
    NotReady("NotReady"),
    Preconditioning("Preconditioning"),
    ;

    private final String value;

    PreconditioningStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
