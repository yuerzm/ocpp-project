package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum IslandingDetectionEnumType {

    NoAntiIslandingSupport("NoAntiIslandingSupport"),
    RoCoF("RoCoF"),
    UVP_OVP("UVP_OVP"),
    UFP_OFP("UFP_OFP"),
    VoltageVectorShift("VoltageVectorShift"),
    ZeroCrossingDetection("ZeroCrossingDetection"),
    OtherPassive("OtherPassive"),
    ImpedanceMeasurement("ImpedanceMeasurement"),
    ImpedanceAtFrequency("ImpedanceAtFrequency"),
    SlipModeFrequencyShift("SlipModeFrequencyShift"),
    SandiaFrequencyShift("SandiaFrequencyShift"),
    SandiaVoltageShift("SandiaVoltageShift"),
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
