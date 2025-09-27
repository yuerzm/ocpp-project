package com.tatadok.ocpp.v21.model.common.enumerations;

public enum MobilityNeedsModeEnumType {

    EVCC("EVCC"),
    EVCC_SECC("EVCC_SECC"),
    ;

    private final String value;

    MobilityNeedsModeEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
