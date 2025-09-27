package com.tatadok.ocpp.v16.model.smartcharging;

public enum GetCompositeScheduleStatus {

    Accepted("Accepted"),

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
