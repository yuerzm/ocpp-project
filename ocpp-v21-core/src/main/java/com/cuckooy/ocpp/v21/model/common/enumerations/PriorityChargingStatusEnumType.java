package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Priority charging status enum type.
 */
public enum PriorityChargingStatusEnumType {

    /**
     * Accepted priority charging status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected priority charging status enum type.
     */
    Rejected("Rejected"),
    /**
     * No profile priority charging status enum type.
     */
    NoProfile("NoProfile"),
    ;

    private final String value;

    PriorityChargingStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
