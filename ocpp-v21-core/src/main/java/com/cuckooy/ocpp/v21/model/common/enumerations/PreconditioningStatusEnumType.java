package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Preconditioning status enum type.
 */
public enum PreconditioningStatusEnumType {

    /**
     * Unknown preconditioning status enum type.
     */
    Unknown("Unknown"),
    /**
     * Ready preconditioning status enum type.
     */
    Ready("Ready"),
    /**
     * Not ready preconditioning status enum type.
     */
    NotReady("NotReady"),
    /**
     * Preconditioning preconditioning status enum type.
     */
    Preconditioning("Preconditioning"),
    ;

    private final String value;

    PreconditioningStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
