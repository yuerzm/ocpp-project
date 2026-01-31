package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Der control enum type.
 */
public enum DERControlEnumType {

    /**
     * Enter service der control enum type.
     */
    EnterService("EnterService"),
    /**
     * Freq droop der control enum type.
     */
    FreqDroop("FreqDroop"),
    /**
     * Freq watt der control enum type.
     */
    FreqWatt("FreqWatt"),
    /**
     * Fixed pf absorb der control enum type.
     */
    FixedPFAbsorb("FixedPFAbsorb"),
    /**
     * Fixed pf inject der control enum type.
     */
    FixedPFInject("FixedPFInject"),
    /**
     * Fixed var der control enum type.
     */
    FixedVar("FixedVar"),
    /**
     * Gradients der control enum type.
     */
    Gradients("Gradients"),
    /**
     * Hf must trip der control enum type.
     */
    HFMustTrip("HFMustTrip"),
    /**
     * Hf may trip der control enum type.
     */
    HFMayTrip("HFMayTrip"),
    /**
     * Hv must trip der control enum type.
     */
    HVMustTrip("HVMustTrip"),
    /**
     * Hv mom cess der control enum type.
     */
    HVMomCess("HVMomCess"),
    /**
     * Hv may trip der control enum type.
     */
    HVMayTrip("HVMayTrip"),
    /**
     * Limit max discharge der control enum type.
     */
    LimitMaxDischarge("LimitMaxDischarge"),
    /**
     * Lf must trip der control enum type.
     */
    LFMustTrip("LFMustTrip"),
    /**
     * Lv must trip der control enum type.
     */
    LVMustTrip("LVMustTrip"),
    /**
     * Lv mom cess der control enum type.
     */
    LVMomCess("LVMomCess"),
    /**
     * Lv may trip der control enum type.
     */
    LVMayTrip("LVMayTrip"),
    /**
     * Power monitoring must trip der control enum type.
     */
    PowerMonitoringMustTrip("PowerMonitoringMustTrip"),
    /**
     * Volt var der control enum type.
     */
    VoltVar("VoltVar"),
    /**
     * Volt watt der control enum type.
     */
    VoltWatt("VoltWatt"),
    /**
     * Watt pf der control enum type.
     */
    WattPF("WattPF"),
    /**
     * Watt var der control enum type.
     */
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
