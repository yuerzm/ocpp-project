package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Phase.
 */
public enum Phase {

    /**
     * L 1 phase.
     */
    L1("L1"),
    /**
     * L 2 phase.
     */
    L2("L2"),
    /**
     * L 3 phase.
     */
    L3("L3"),
    /**
     * N phase.
     */
    N("N"),
    /**
     * L 1 n phase.
     */
    L1_N("L1-N"),
    /**
     * L 2 n phase.
     */
    L2_N("L2-N"),
    /**
     * L 3 n phase.
     */
    L3_N("L3-N"),
    /**
     * L 1 l 2 phase.
     */
    L1_L2("L1-L2"),
    /**
     * L 2 l 3 phase.
     */
    L2_L3("L2-L3"),
    /**
     * L 3 l 1 phase.
     */
    L3_L1("L3-L1");

    private final String value;

    Phase(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
