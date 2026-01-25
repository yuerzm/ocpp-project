package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum TariffKindEnumType {

    DefaultTariff("DefaultTariff"),
    DriverTariff("DriverTariff"),
    ;

    private final String value;

    TariffKindEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
