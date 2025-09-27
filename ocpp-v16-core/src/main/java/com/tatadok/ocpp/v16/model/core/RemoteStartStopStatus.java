package com.tatadok.ocpp.v16.model.core;

public enum RemoteStartStopStatus {

    Accepted("Accepted"),

    Rejected("Rejected");

    private final String value;

    RemoteStartStopStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
