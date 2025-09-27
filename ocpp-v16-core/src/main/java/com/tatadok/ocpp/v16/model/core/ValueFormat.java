package com.tatadok.ocpp.v16.model.core;

public enum ValueFormat {

    Raw("Raw"),

    SignedData("SignedData");

    private final String value;

    ValueFormat(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}