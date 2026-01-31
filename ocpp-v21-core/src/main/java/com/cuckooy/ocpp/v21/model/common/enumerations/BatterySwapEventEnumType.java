package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Battery swap event enum type.
 */
public enum BatterySwapEventEnumType {

    /**
     * Battery in battery swap event enum type.
     */
    BatteryIn("BatteryIn"),
    /**
     * Battery out battery swap event enum type.
     */
    BatteryOut("BatteryOut"),
    /**
     * Battery out timeout battery swap event enum type.
     */
    BatteryOutTimeout("BatteryOutTimeout"),
    ;

    private final String value;

    BatterySwapEventEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
