package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Tariff kind enum type.
 */
public enum TariffKindEnumType {

    /**
     * Default tariff tariff kind enum type.
     */
    DefaultTariff("DefaultTariff"),
    /**
     * Driver tariff tariff kind enum type.
     */
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
