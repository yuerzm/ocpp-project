package com.tatadok.ocpp.v21.model.common.enumerations;

public enum ReservationUpdateStatusEnumType {

    Expired("Expired"),

    Removed("Removed"),
    
    NoTransaction("NoTransaction"),
    ;

    private final String value;

    ReservationUpdateStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
