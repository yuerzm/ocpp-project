package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Apn authentication enum type.
 */
public enum APNAuthenticationEnumType {

    /**
     * Chap apn authentication enum type.
     */
    CHAP("CHAP"),
    /**
     * None apn authentication enum type.
     */
    NONE("NONE"),
    /**
     * Pap apn authentication enum type.
     */
    PAP("PAP"),
    /**
     * Auto apn authentication enum type.
     */
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
