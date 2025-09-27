package com.tatadok.ocpp.v21.model.common.enumerations;

public enum TariffClearStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    NoTariff("NoTariff"),
    ;

    private final String value;

    TariffClearStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
