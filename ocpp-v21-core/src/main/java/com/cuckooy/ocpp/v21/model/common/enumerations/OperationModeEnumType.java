package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Operation mode enum type.
 */
public enum OperationModeEnumType {

    /**
     * Idle operation mode enum type.
     */
    Idle("Idle"),
    /**
     * Charging only operation mode enum type.
     */
    ChargingOnly("ChargingOnly"),
    /**
     * Central setpoint operation mode enum type.
     */
    CentralSetpoint("CentralSetpoint"),
    /**
     * External setpoint operation mode enum type.
     */
    ExternalSetpoint("ExternalSetpoint"),
    /**
     * External limits operation mode enum type.
     */
    ExternalLimits("ExternalLimits"),
    /**
     * Central frequency operation mode enum type.
     */
    CentralFrequency("CentralFrequency"),
    /**
     * Local frequency operation mode enum type.
     */
    LocalFrequency("LocalFrequency"),
    /**
     * Local load balancing operation mode enum type.
     */
    LocalLoadBalancing("LocalLoadBalancing"),
    ;

    private final String value;

    OperationModeEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
