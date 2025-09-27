package com.tatadok.ocpp.v21.model.common.enumerations;

public enum CostDimensionEnumType {

    Energy("Energy"),
    MaxCurrent("MaxCurrent"),
    MinCurrent("MinCurrent"),
    MaxPower("MaxPower"),
    MinPower("MinPower"),
    IdleTIme("IdleTIme"),
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
