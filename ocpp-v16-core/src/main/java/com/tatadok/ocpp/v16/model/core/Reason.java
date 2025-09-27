package com.tatadok.ocpp.v16.model.core;

public enum Reason {

    EmergencyStop("EmergencyStop"),

    EVDisconnected("EVDisconnected"),

    HardReset("HardReset"),

    Local("Local"),

    Other("Other"),

    PowerLoss("PowerLoss"),

    Reboot("Reboot"),

    Remote("Remote"),

    SoftReset("SoftReset"),

    UnlockCommand("UnlockCommand"),

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
