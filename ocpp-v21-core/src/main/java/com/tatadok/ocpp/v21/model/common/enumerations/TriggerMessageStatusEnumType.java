package com.tatadok.ocpp.v21.model.common.enumerations;

public enum TriggerMessageStatusEnumType {

    Accepted("Accepted"),

    Rejected("Rejected"),

    NotImplemented("NotImplemented");

    private final String value;

    TriggerMessageStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
