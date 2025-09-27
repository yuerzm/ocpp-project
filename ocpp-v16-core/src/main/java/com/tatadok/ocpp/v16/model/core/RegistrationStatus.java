package com.tatadok.ocpp.v16.model.core;

public enum RegistrationStatus {

    Accepted("Accepted"),

    Pending("Pending"),

    Rejected("Rejected");

    private final String value;

    RegistrationStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
