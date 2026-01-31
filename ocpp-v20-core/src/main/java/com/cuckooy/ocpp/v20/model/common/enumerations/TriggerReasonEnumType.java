package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Trigger reason enum type.
 */
public enum TriggerReasonEnumType {

    /**
     * Authorized trigger reason enum type.
     */
    Authorized("Authorized"),
    /**
     * Cable plugged in trigger reason enum type.
     */
    CablePluggedIn("CablePluggedIn"),
    /**
     * Charging rate changed trigger reason enum type.
     */
    ChargingRateChanged("ChargingRateChanged"),
    /**
     * Charging state changed trigger reason enum type.
     */
    ChargingStateChanged("ChargingStateChanged"),
    /**
     * Deauthorized trigger reason enum type.
     */
    Deauthorized("Deauthorized"),
    /**
     * Energy limit reached trigger reason enum type.
     */
    EnergyLimitReached("EnergyLimitReached"),
    /**
     * Ev communication lost trigger reason enum type.
     */
    EVCommunicationLost("EVCommunicationLost"),
    /**
     * Ev connect timeout trigger reason enum type.
     */
    EVConnectTimeout("EVConnectTimeout"),
    /**
     * Meter value clock trigger reason enum type.
     */
    MeterValueClock("MeterValueClock"),
    /**
     * Meter value periodic trigger reason enum type.
     */
    MeterValuePeriodic("MeterValuePeriodic"),
    /**
     * Time limit reached trigger reason enum type.
     */
    TimeLimitReached("TimeLimitReached"),
    /**
     * Trigger trigger reason enum type.
     */
    Trigger("Trigger"),
    /**
     * Unlock command trigger reason enum type.
     */
    UnlockCommand("UnlockCommand"),
    /**
     * Stop authorized trigger reason enum type.
     */
    StopAuthorized("StopAuthorized"),
    /**
     * Ev departed trigger reason enum type.
     */
    EVDeparted("EVDeparted"),
    /**
     * Ev detected trigger reason enum type.
     */
    EVDetected("EVDetected"),
    /**
     * Remote stop trigger reason enum type.
     */
    RemoteStop("RemoteStop"),
    /**
     * Remote start trigger reason enum type.
     */
    RemoteStart("RemoteStart"),
    /**
     * Abnormal condition trigger reason enum type.
     */
    AbnormalCondition("AbnormalCondition"),
    /**
     * Signed data received trigger reason enum type.
     */
    SignedDataReceived("SignedDataReceived"),
    /**
     * Reset command trigger reason enum type.
     */
    ResetCommand("ResetCommand");

    private final String value;

    TriggerReasonEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
