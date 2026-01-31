package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Request start stop status enum type.
 */
public enum RequestStartStopStatusEnumType {

    /**
     * Accepted request start stop status enum type.
     */
    Accepted("Accepted"),

    /**
     * Rejected request start stop status enum type.
     */
    Rejected("Rejected");

    private final String value;

    RequestStartStopStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
