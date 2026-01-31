package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Energy transfer mode enum type.
 */
public enum EnergyTransferModeEnumType {

    /**
     * Dc energy transfer mode enum type.
     */
    DC("DC"),

    /**
     * Ac single phase energy transfer mode enum type.
     */
    AC_single_phase("AC_single_phase"),

    /**
     * Ac two phase energy transfer mode enum type.
     */
    AC_two_phase("AC_two_phase"),

    /**
     * Ac three phase energy transfer mode enum type.
     */
    AC_three_phase("AC_three_phase");

    private final String value;

    EnergyTransferModeEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
