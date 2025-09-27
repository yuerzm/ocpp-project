package com.tatadok.ocpp.v16.model.core;

public enum ReadingContext {

    InterruptionBegin("Interruption.Begin"),
    InterruptionEnd("Interruption.End"),
    Other("Other"),
    SampleClock("Sample.Clock"),
    SamplePeriodic("Sample.Periodic"),
    TransactionBegin("Transaction.Begin"),
    TransactionEnd("Transaction.End"),
    Trigger("Trigger");

    private final String value;

    ReadingContext(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
