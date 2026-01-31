package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Mobility needs mode enum type.
 */
public enum MobilityNeedsModeEnumType {

    /**
     * Evcc mobility needs mode enum type.
     */
    EVCC("EVCC"),
    /**
     * Evcc secc mobility needs mode enum type.
     */
    EVCC_SECC("EVCC_SECC"),
    ;

    private final String value;

    MobilityNeedsModeEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
