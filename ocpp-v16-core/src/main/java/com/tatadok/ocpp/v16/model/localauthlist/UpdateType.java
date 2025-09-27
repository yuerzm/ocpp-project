package com.tatadok.ocpp.v16.model.localauthlist;

public enum UpdateType {

    Differential("Differential"),

    Full("Full");

    private final String value;

    UpdateType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
