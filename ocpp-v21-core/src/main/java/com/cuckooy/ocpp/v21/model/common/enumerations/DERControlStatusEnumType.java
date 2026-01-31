package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Der control status enum type.
 */
public enum DERControlStatusEnumType {

    /**
     * Accepted der control status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected der control status enum type.
     */
    Rejected("Rejected"),
    /**
     * Not supported der control status enum type.
     */
    NotSupported("NotSupported"),
    /**
     * Not found der control status enum type.
     */
    NotFound("NotFound"),
    ;

    private final String value;

    DERControlStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
