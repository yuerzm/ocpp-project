package com.tatadok.ocpp.v21.model.common.enumerations;

public enum BatterySwapEventEnumType {

    BatteryIn("BatteryIn"),
    BatteryOut("BatteryOut"),
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
