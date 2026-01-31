package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Power during cessation enum type.
 */
public enum PowerDuringCessationEnumType {

    /**
     * Active power during cessation enum type.
     */
    Active("Active"),
    /**
     * Reactive power during cessation enum type.
     */
    Reactive("Reactive"),
    ;

    private final String value;

    PowerDuringCessationEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
