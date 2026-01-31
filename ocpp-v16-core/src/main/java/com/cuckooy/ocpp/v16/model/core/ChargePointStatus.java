package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Charge point status.
 */
public enum ChargePointStatus {

    /**
     * Available charge point status.
     */
    Available("Available"),
    /**
     * Preparing charge point status.
     */
    Preparing("Preparing"),
    /**
     * Charging charge point status.
     */
    Charging("Charging"),
    /**
     * Suspended evse charge point status.
     */
    SuspendedEVSE("SuspendedEVSE"),
    /**
     * Suspended ev charge point status.
     */
    SuspendedEV("SuspendedEV"),
    /**
     * Finishing charge point status.
     */
    Finishing("Finishing"),
    /**
     * Reserved charge point status.
     */
    Reserved("Reserved"),
    /**
     * Unavailable charge point status.
     */
    Unavailable("Unavailable"),
    /**
     * Faulted charge point status.
     */
    Faulted("Faulted");

    private final String value;

    ChargePointStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
