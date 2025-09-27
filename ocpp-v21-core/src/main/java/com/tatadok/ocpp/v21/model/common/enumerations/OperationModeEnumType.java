package com.tatadok.ocpp.v21.model.common.enumerations;

public enum OperationModeEnumType {

    Idle("Idle"),
    ChargingOnly("ChargingOnly"),
    CentralSetpoint("CentralSetpoint"),
    ExternalSetpoint("ExternalSetpoint"),
    ExternalLimits("ExternalLimits"),
    CentralFrequency("CentralFrequency"),
    LocalFrequency("LocalFrequency"),
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
