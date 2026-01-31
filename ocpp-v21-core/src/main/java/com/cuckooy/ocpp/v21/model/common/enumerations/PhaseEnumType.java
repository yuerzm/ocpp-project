package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Phase enum type.
 */
public enum PhaseEnumType {

    /**
     * L 1 phase enum type.
     */
    L1("L1"),

    /**
     * L 2 phase enum type.
     */
    L2("L2"),

    /**
     * L 3 phase enum type.
     */
    L3("L3"),

    /**
     * N phase enum type.
     */
    N("N"),

    /**
     * L 1 n phase enum type.
     */
    L1N("L1-N"),

    /**
     * L 2 n phase enum type.
     */
    L2N("L2-N"),

    /**
     * L 3 n phase enum type.
     */
    L3N("L3-N"),

    /**
     * L 1 l 2 phase enum type.
     */
    L1L2("L1-L2"),

    /**
     * L 2 l 3 phase enum type.
     */
    L2L3("L2-L3"),

    /**
     * L 3 l 1 phase enum type.
     */
    L3L1("L3-L1");

    private final String value;

    PhaseEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
