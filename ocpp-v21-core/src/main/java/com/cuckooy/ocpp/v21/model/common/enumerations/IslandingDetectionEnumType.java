package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Islanding detection enum type.
 */
public enum IslandingDetectionEnumType {

    /**
     * No anti islanding support islanding detection enum type.
     */
    NoAntiIslandingSupport("NoAntiIslandingSupport"),
    /**
     * Ro co f islanding detection enum type.
     */
    RoCoF("RoCoF"),
    /**
     * Uvp ovp islanding detection enum type.
     */
    UVP_OVP("UVP_OVP"),
    /**
     * Ufp ofp islanding detection enum type.
     */
    UFP_OFP("UFP_OFP"),
    /**
     * Voltage vector shift islanding detection enum type.
     */
    VoltageVectorShift("VoltageVectorShift"),
    /**
     * Zero crossing detection islanding detection enum type.
     */
    ZeroCrossingDetection("ZeroCrossingDetection"),
    /**
     * Other passive islanding detection enum type.
     */
    OtherPassive("OtherPassive"),
    /**
     * Impedance measurement islanding detection enum type.
     */
    ImpedanceMeasurement("ImpedanceMeasurement"),
    /**
     * Impedance at frequency islanding detection enum type.
     */
    ImpedanceAtFrequency("ImpedanceAtFrequency"),
    /**
     * Slip mode frequency shift islanding detection enum type.
     */
    SlipModeFrequencyShift("SlipModeFrequencyShift"),
    /**
     * Sandia frequency shift islanding detection enum type.
     */
    SandiaFrequencyShift("SandiaFrequencyShift"),
    /**
     * Sandia voltage shift islanding detection enum type.
     */
    SandiaVoltageShift("SandiaVoltageShift"),
    /**
     * Other active islanding detection enum type.
     */
    OtherActive("OtherActive"),
    ;

    private final String value;

    IslandingDetectionEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
