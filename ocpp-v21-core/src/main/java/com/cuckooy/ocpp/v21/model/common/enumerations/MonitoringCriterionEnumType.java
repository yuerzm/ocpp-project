package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Monitoring criterion enum type.
 */
public enum MonitoringCriterionEnumType {

    /**
     * Threshold monitoring monitoring criterion enum type.
     */
    ThresholdMonitoring("ThresholdMonitoring"),
    /**
     * Delta monitoring monitoring criterion enum type.
     */
    DeltaMonitoring("DeltaMonitoring"),
    /**
     * Periodic monitoring monitoring criterion enum type.
     */
    PeriodicMonitoring("PeriodicMonitoring");

    private final String value;

    MonitoringCriterionEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
