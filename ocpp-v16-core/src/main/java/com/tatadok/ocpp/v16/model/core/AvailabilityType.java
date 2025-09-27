package com.tatadok.ocpp.v16.model.core;

public enum AvailabilityType {

    Inoperative("Inoperative"),

    Operative("Operative");

    private final String value;

    AvailabilityType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }


}