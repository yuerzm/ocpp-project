package com.tatadok.ocpp.v21.model.common.enumerations;

public enum DERControlStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    NotSupported("NotSupported"),
    NotFound("NotFound"),
    ;

    private final String value;

    DERControlStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
