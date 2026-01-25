package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum ReadingContextEnumType {

    InterruptionBegin("Interruption.Begin"),

    InterruptionEnd("Interruption.End"),

    SampleClock("Sample.Clock"),

    SamplePeriodic("Sample.Periodic"),

    TransactionBegin("Transaction.Begin"),

    TransactionEnd("Transaction.End"),

    Trigger("Trigger"),

    Other("Other");

    private final String value;

    ReadingContextEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
