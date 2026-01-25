package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum OCPPVersionEnumType {

    OCPP12("OCPP12"),
    OCPP15("OCPP15"),
    OCPP16("OCPP16"),
    OCPP20("OCPP20"),
    OCPP201("OCPP201"),
    OCPP21("OCPP21"),
    ;

    private final String value;

    OCPPVersionEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
