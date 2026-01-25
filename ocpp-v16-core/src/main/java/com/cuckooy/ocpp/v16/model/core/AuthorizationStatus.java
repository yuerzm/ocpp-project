package com.cuckooy.ocpp.v16.model.core;

public enum AuthorizationStatus {

    Accepted("Accepted"),

    Blocked("Blocked"),

    Expired("Expired"),

    Invalid("Invalid"),

    ConcurrentTx("ConcurrentTx");

    private final String value;

    AuthorizationStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}