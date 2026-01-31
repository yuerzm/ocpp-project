package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Set network profile status enum type.
 */
public enum SetNetworkProfileStatusEnumType {

    /**
     * Accepted set network profile status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected set network profile status enum type.
     */
    Rejected("Rejected"),
    /**
     * Failed set network profile status enum type.
     */
    Failed("Failed");

    private final String value;

    SetNetworkProfileStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
