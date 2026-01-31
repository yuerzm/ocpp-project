package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Payment status enum type.
 */
public enum PaymentStatusEnumType {

    /**
     * Settled payment status enum type.
     */
    Settled("Settled"),
    /**
     * Canceled payment status enum type.
     */
    Canceled("Canceled"),
    /**
     * Rejected payment status enum type.
     */
    Rejected("Rejected"),
    /**
     * Failed payment status enum type.
     */
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
