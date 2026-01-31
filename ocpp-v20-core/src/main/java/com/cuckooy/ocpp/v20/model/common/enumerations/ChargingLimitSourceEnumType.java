package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Charging limit source enum type.
 */
public enum ChargingLimitSourceEnumType {

    /**
     * Ems charging limit source enum type.
     */
    EMS("EMS"),
    /**
     * Other charging limit source enum type.
     */
    Other("Other"),
    /**
     * So charging limit source enum type.
     */
    SO("SO"),
    /**
     * Cso charging limit source enum type.
     */
    CSO("CSO");

    private final String value;

    ChargingLimitSourceEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
