package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Tariff get status enum type.
 */
public enum TariffGetStatusEnumType {

    /**
     * Accepted tariff get status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected tariff get status enum type.
     */
    Rejected("Rejected"),
    /**
     * No tariff tariff get status enum type.
     */
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
