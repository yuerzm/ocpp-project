package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum DERControlEnumType {

    EnterService("EnterService"),
    FreqDroop("FreqDroop"),
    FreqWatt("FreqWatt"),
    FixedPFAbsorb("FixedPFAbsorb"),
    FixedPFInject("FixedPFInject"),
    FixedVar("FixedVar"),
    Gradients("Gradients"),
    HFMustTrip("HFMustTrip"),
    HFMayTrip("HFMayTrip"),
    HVMustTrip("HVMustTrip"),
    HVMomCess("HVMomCess"),
    HVMayTrip("HVMayTrip"),
    LimitMaxDischarge("LimitMaxDischarge"),
    LFMustTrip("LFMustTrip"),
    LVMustTrip("LVMustTrip"),
    LVMomCess("LVMomCess"),
    LVMayTrip("LVMayTrip"),
    PowerMonitoringMustTrip("PowerMonitoringMustTrip"),
    VoltVar("VoltVar"),
    VoltWatt("VoltWatt"),
    WattPF("WattPF"),
    WattVar("WattVar"),
    ;

    private final String value;

    DERControlEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
