package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum APNAuthenticationEnumType {

    CHAP("CHAP"),
    NONE("NONE"),
    PAP("PAP"),
    AUTO("AUTO");

    private final String value;

    APNAuthenticationEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
