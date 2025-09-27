package com.tatadok.ocpp.v21.model.common.enumerations;

public enum ChargingLimitSourceEnumType {

    EMS("EMS"),
    Other("Other"),
    SO("SO"),
    CSO("CSO");

    private final String value;

    ChargingLimitSourceEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
