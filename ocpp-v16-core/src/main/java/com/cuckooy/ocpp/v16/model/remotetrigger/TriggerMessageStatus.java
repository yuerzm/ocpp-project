package com.cuckooy.ocpp.v16.model.remotetrigger;

/**
 * The enum Trigger message status.
 */
public enum TriggerMessageStatus {

    /**
     * Accepted trigger message status.
     */
    Accepted("Accepted"),

    /**
     * Rejected trigger message status.
     */
    Rejected("Rejected"),

    /**
     * Not implemented trigger message status.
     */
    NotImplemented("NotImplemented");

    private final String value;

    TriggerMessageStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
