package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Grid event fault enum type.
 */
public enum GridEventFaultEnumType {

    /**
     * Current imbalance grid event fault enum type.
     */
    CurrentImbalance("CurrentImbalance"),
    /**
     * Local emergency grid event fault enum type.
     */
    LocalEmergency("LocalEmergency"),
    /**
     * Low input power grid event fault enum type.
     */
    LowInputPower("LowInputPower"),
    /**
     * Over current grid event fault enum type.
     */
    OverCurrent("OverCurrent"),
    /**
     * Over frequency grid event fault enum type.
     */
    OverFrequency("OverFrequency"),
    /**
     * Over voltage grid event fault enum type.
     */
    OverVoltage("OverVoltage"),
    /**
     * Phase rotation grid event fault enum type.
     */
    PhaseRotation("PhaseRotation"),
    /**
     * Remote emergency grid event fault enum type.
     */
    RemoteEmergency("RemoteEmergency"),
    /**
     * Under frequency grid event fault enum type.
     */
    UnderFrequency("UnderFrequency"),
    /**
     * Under voltage grid event fault enum type.
     */
    UnderVoltage("UnderVoltage"),
    /**
     * Voltage imbalance grid event fault enum type.
     */
    VoltageImbalance("VoltageImbalance"),
    ;

    private final String value;

    GridEventFaultEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
