package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum TariffGetStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    NoTariff("NoTariff"),
    ;

    private final String value;

    TariffGetStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
