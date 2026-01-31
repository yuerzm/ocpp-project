package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Transaction event enum type.
 */
public enum TransactionEventEnumType {

    /**
     * Ended transaction event enum type.
     */
    Ended("Ended"),
    /**
     * Started transaction event enum type.
     */
    Started("Started"),
    /**
     * Updated transaction event enum type.
     */
    Updated("Updated");

    private final String value;

    TransactionEventEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
