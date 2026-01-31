package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Reading context enum type.
 */
public enum ReadingContextEnumType {

    /**
     * Interruption begin reading context enum type.
     */
    InterruptionBegin("Interruption.Begin"),

    /**
     * Interruption end reading context enum type.
     */
    InterruptionEnd("Interruption.End"),

    /**
     * Sample clock reading context enum type.
     */
    SampleClock("Sample.Clock"),

    /**
     * Sample periodic reading context enum type.
     */
    SamplePeriodic("Sample.Periodic"),

    /**
     * Transaction begin reading context enum type.
     */
    TransactionBegin("Transaction.Begin"),

    /**
     * Transaction end reading context enum type.
     */
    TransactionEnd("Transaction.End"),

    /**
     * Trigger reading context enum type.
     */
    Trigger("Trigger"),

    /**
     * Other reading context enum type.
     */
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
