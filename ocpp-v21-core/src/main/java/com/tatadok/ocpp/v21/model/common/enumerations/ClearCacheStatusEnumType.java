package com.tatadok.ocpp.v21.model.common.enumerations;

public enum ClearCacheStatusEnumType {

    Accepted("Accepted"),

    Rejected("Rejected");

    private final String value;

    ClearCacheStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
