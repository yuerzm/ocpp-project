package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Monitor enum type.
 */
public enum MonitorEnumType {

    /**
     * Upper threshold monitor enum type.
     */
    UpperThreshold("UpperThreshold"),

    /**
     * Lower threshold monitor enum type.
     */
    LowerThreshold("LowerThreshold"),

    /**
     * Delta monitor enum type.
     */
    Delta("Delta"),

    /**
     * Periodic monitor enum type.
     */
    Periodic("Periodic"),

    /**
     * Periodic clock aligned monitor enum type.
     */
    PeriodicClockAligned("PeriodicClockAligned"),

    /**
     * Target delta monitor enum type.
     */
    TargetDelta("TargetDelta"),
    /**
     * Target delta relative monitor enum type.
     */
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
