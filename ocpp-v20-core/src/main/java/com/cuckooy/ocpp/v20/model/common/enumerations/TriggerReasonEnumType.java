package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum TriggerReasonEnumType {

    Authorized("Authorized"),
    CablePluggedIn("CablePluggedIn"),
    ChargingRateChanged("ChargingRateChanged"),
    ChargingStateChanged("ChargingStateChanged"),
    Deauthorized("Deauthorized"),
    EnergyLimitReached("EnergyLimitReached"),
    EVCommunicationLost("EVCommunicationLost"),
    EVConnectTimeout("EVConnectTimeout"),
    MeterValueClock("MeterValueClock"),
    MeterValuePeriodic("MeterValuePeriodic"),
    TimeLimitReached("TimeLimitReached"),
    Trigger("Trigger"),
    UnlockCommand("UnlockCommand"),
    StopAuthorized("StopAuthorized"),
    EVDeparted("EVDeparted"),
    EVDetected("EVDetected"),
    RemoteStop("RemoteStop"),
    RemoteStart("RemoteStart"),
    AbnormalCondition("AbnormalCondition"),
    SignedDataReceived("SignedDataReceived"),
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
