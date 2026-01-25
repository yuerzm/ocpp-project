package com.cuckooy.ocpp.v16.model.core;

public enum ClearCacheStatus {

    Accepted("Accepted"),

    Rejected("Rejected");

    private final String value;

    ClearCacheStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}