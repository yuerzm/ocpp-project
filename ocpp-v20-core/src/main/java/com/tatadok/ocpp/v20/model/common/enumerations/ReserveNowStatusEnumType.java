package com.tatadok.ocpp.v20.model.common.enumerations;

public enum ReserveNowStatusEnumType {

    Accepted("Accepted"),
    Faulted("Faulted"),
    Occupied("Occupied"),
    Rejected("Rejected"),
    Unavailable("Unavailable");

    private final String value;

    ReserveNowStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
