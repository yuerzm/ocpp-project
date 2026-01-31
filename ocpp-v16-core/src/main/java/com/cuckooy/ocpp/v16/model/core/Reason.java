package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Reason.
 */
public enum Reason {

    /**
     * Emergency stop reason.
     */
    EmergencyStop("EmergencyStop"),

    /**
     * Ev disconnected reason.
     */
    EVDisconnected("EVDisconnected"),

    /**
     * Hard reset reason.
     */
    HardReset("HardReset"),

    /**
     * Local reason.
     */
    Local("Local"),

    /**
     * Other reason.
     */
    Other("Other"),

    /**
     * Power loss reason.
     */
    PowerLoss("PowerLoss"),

    /**
     * Reboot reason.
     */
    Reboot("Reboot"),

    /**
     * Remote reason.
     */
    Remote("Remote"),

    /**
     * Soft reset reason.
     */
    SoftReset("SoftReset"),

    /**
     * Unlock command reason.
     */
    UnlockCommand("UnlockCommand"),

    /**
     * De authorized reason.
     */
    DeAuthorized("DeAuthorized");

    private final String value;

    Reason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
