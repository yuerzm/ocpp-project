package com.tatadok.ocpp.v16.model.core;

public enum ResetStatus {

    Accepted("Accepted"),

    Rejected("Rejected");

    private final String value;

    ResetStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
