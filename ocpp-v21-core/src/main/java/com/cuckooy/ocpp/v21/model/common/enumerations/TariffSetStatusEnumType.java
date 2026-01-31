package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Tariff set status enum type.
 */
public enum TariffSetStatusEnumType {

    /**
     * Accepted tariff set status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected tariff set status enum type.
     */
    Rejected("Rejected"),
    /**
     * Too many elements tariff set status enum type.
     */
    TooManyElements("TooManyElements"),
    /**
     * Condition not supported tariff set status enum type.
     */
    ConditionNotSupported("ConditionNotSupported"),
    /**
     * Duplicate tariff id tariff set status enum type.
     */
    DuplicateTariffId("DuplicateTariffId"),
    ;

    private final String value;

    TariffSetStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
