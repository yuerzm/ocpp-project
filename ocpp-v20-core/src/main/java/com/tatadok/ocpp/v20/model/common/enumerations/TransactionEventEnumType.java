package com.tatadok.ocpp.v20.model.common.enumerations;

public enum TransactionEventEnumType {

    Ended("Ended"),
    Started("Started"),
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
