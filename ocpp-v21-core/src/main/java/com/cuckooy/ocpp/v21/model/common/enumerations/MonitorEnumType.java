package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum MonitorEnumType {

    UpperThreshold("UpperThreshold"),

    LowerThreshold("LowerThreshold"),

    Delta("Delta"),

    Periodic("Periodic"),

    PeriodicClockAligned("PeriodicClockAligned"),

    TargetDelta("TargetDelta"),
    TargetDeltaRelative("TargetDeltaRelative"),
    ;

    private final String value;

    MonitorEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
