package com.tatadok.ocpp.v21.model.common.enumerations;

public enum ReasonEnumType {

    DeAuthorized("DeAuthorized"),
    EmergencyStop("EmergencyStop"),
    EnergyLimitReached("EnergyLimitReached"),
    EVDisconnected("EVDisconnected"),
    GroundFault("GroundFault"),
    ImmediateReset("ImmediateReset"),
    Local("Local"),
    LocalOutOfCredit("LocalOutOfCredit"),
    MasterPass("MasterPass"),
    Other("Other"),
    OvercurrentFault("OvercurrentFault"),
    PowerLoss("PowerLoss"),
    PowerQuality("PowerQuality"),
    Reboot("Reboot"),
    Remote("Remote"),
    SOCLimitReached("SOCLimitReached"),
    StoppedByEV("StoppedByEV"),
    TimeLimitReached("TimeLimitReached"),
    Timeout("Timeout"),
    ReqEnergyTransferRejected("ReqEnergyTransferRejected"),
    ;

    private final String value;

    ReasonEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
