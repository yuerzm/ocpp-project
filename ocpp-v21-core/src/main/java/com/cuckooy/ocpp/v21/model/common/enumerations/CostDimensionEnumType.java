package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Cost dimension enum type.
 */
public enum CostDimensionEnumType {

    /**
     * Energy cost dimension enum type.
     */
    Energy("Energy"),
    /**
     * Max current cost dimension enum type.
     */
    MaxCurrent("MaxCurrent"),
    /**
     * Min current cost dimension enum type.
     */
    MinCurrent("MinCurrent"),
    /**
     * Max power cost dimension enum type.
     */
    MaxPower("MaxPower"),
    /**
     * Min power cost dimension enum type.
     */
    MinPower("MinPower"),
    /**
     * Idle t ime cost dimension enum type.
     */
    IdleTIme("IdleTIme"),
    /**
     * Charging time cost dimension enum type.
     */
    ChargingTime("ChargingTime"),
    ;

    private final String value;

    CostDimensionEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
