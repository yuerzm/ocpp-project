package com.cuckooy.ocpp.v16.model.core;

public enum AvailabilityStatus {

    Accepted("Accepted"),

    Rejected("Rejected"),

    Scheduled("Scheduled");

    private final String value;

    AvailabilityStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}