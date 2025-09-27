package com.tatadok.ocpp.v21.model.common.enumerations;

public enum PaymentStatusEnumType {

    Settled("Settled"),
    Canceled("Canceled"),
    Rejected("Rejected"),
    Failed("Failed"),
    ;

    private final String value;

    PaymentStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
