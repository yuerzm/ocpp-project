package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Reading context.
 */
public enum ReadingContext {

    /**
     * Interruption begin reading context.
     */
    InterruptionBegin("Interruption.Begin"),
    /**
     * Interruption end reading context.
     */
    InterruptionEnd("Interruption.End"),
    /**
     * Other reading context.
     */
    Other("Other"),
    /**
     * Sample clock reading context.
     */
    SampleClock("Sample.Clock"),
    /**
     * Sample periodic reading context.
     */
    SamplePeriodic("Sample.Periodic"),
    /**
     * Transaction begin reading context.
     */
    TransactionBegin("Transaction.Begin"),
    /**
     * Transaction end reading context.
     */
    TransactionEnd("Transaction.End"),
    /**
     * Trigger reading context.
     */
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
