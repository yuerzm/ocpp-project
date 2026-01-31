package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Reason enum type.
 */
public enum ReasonEnumType {

    /**
     * De authorized reason enum type.
     */
    DeAuthorized("DeAuthorized"),
    /**
     * Emergency stop reason enum type.
     */
    EmergencyStop("EmergencyStop"),
    /**
     * Energy limit reached reason enum type.
     */
    EnergyLimitReached("EnergyLimitReached"),
    /**
     * Ev disconnected reason enum type.
     */
    EVDisconnected("EVDisconnected"),
    /**
     * Ground fault reason enum type.
     */
    GroundFault("GroundFault"),
    /**
     * Immediate reset reason enum type.
     */
    ImmediateReset("ImmediateReset"),
    /**
     * Local reason enum type.
     */
    Local("Local"),
    /**
     * Local out of credit reason enum type.
     */
    LocalOutOfCredit("LocalOutOfCredit"),
    /**
     * Master pass reason enum type.
     */
    MasterPass("MasterPass"),
    /**
     * Other reason enum type.
     */
    Other("Other"),
    /**
     * Overcurrent fault reason enum type.
     */
    OvercurrentFault("OvercurrentFault"),
    /**
     * Power loss reason enum type.
     */
    PowerLoss("PowerLoss"),
    /**
     * Power quality reason enum type.
     */
    PowerQuality("PowerQuality"),
    /**
     * Reboot reason enum type.
     */
    Reboot("Reboot"),
    /**
     * Remote reason enum type.
     */
    Remote("Remote"),
    /**
     * Soc limit reached reason enum type.
     */
    SOCLimitReached("SOCLimitReached"),
    /**
     * Stopped by ev reason enum type.
     */
    StoppedByEV("StoppedByEV"),
    /**
     * Time limit reached reason enum type.
     */
    TimeLimitReached("TimeLimitReached"),
    /**
     * Timeout reason enum type.
     */
    Timeout("Timeout");

    private final String value;

    ReasonEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
