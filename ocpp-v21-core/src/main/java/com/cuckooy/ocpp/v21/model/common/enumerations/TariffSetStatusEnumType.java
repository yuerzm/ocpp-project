package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum TariffSetStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    TooManyElements("TooManyElements"),
    ConditionNotSupported("ConditionNotSupported"),
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
