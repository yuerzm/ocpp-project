package com.tatadok.ocpp.v16.model.core;

public enum ResetType {

    Hard("Hard"),

    Soft("Soft");

    private final String value;

    ResetType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
