package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Reserve now status enum type.
 */
public enum ReserveNowStatusEnumType {

    /**
     * Accepted reserve now status enum type.
     */
    Accepted("Accepted"),
    /**
     * Faulted reserve now status enum type.
     */
    Faulted("Faulted"),
    /**
     * Occupied reserve now status enum type.
     */
    Occupied("Occupied"),
    /**
     * Rejected reserve now status enum type.
     */
    Rejected("Rejected"),
    /**
     * Unavailable reserve now status enum type.
     */
    Unavailable("Unavailable");

    private final String value;

    ReserveNowStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
