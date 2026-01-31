package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Tariff change status enum type.
 */
public enum TariffChangeStatusEnumType {

    /**
     * Accepted tariff change status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected tariff change status enum type.
     */
    Rejected("Rejected"),
    /**
     * Condition not supported tariff change status enum type.
     */
    ConditionNotSupported("ConditionNotSupported"),
    /**
     * Tx not found tariff change status enum type.
     */
    TxNotFound("TxNotFound"),
    /**
     * No currency change tariff change status enum type.
     */
    NoCurrencyChange("NoCurrencyChange"),
    ;

    private final String value;

    TariffChangeStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
