package com.tatadok.ocpp.v21.model.common.enumerations;

public enum TariffChangeStatusEnumType {

    Accepted("Accepted"),
    Rejected("Rejected"),
    ConditionNotSupported("ConditionNotSupported"),
    TxNotFound("TxNotFound"),
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
