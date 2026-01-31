package com.cuckooy.ocpp.v16.model.security.types;

/**
 * The enum Trigger message status enum type.
 */
public enum TriggerMessageStatusEnumType {

    /**
     * Accepted trigger message status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected trigger message status enum type.
     */
    Rejected("Rejected"),
    /**
     * Not implemented trigger message status enum type.
     */
    NotImplemented("NotImplemented");

    private final String value;

    TriggerMessageStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
