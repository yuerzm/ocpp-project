package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Tariff clear status enum type.
 */
public enum TariffClearStatusEnumType {

    /**
     * Accepted tariff clear status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected tariff clear status enum type.
     */
    Rejected("Rejected"),
    /**
     * No tariff tariff clear status enum type.
     */
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
