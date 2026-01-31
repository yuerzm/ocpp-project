package com.cuckooy.ocpp.v16.model.smartcharging;

/**
 * The enum Get composite schedule status.
 */
public enum GetCompositeScheduleStatus {

    /**
     * Accepted get composite schedule status.
     */
    Accepted("Accepted"),

    /**
     * Rejected get composite schedule status.
     */
    Rejected("Rejected");

    private final String value;

    GetCompositeScheduleStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
