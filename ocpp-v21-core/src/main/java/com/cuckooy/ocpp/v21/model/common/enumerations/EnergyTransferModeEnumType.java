package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Energy transfer mode enum type.
 */
public enum EnergyTransferModeEnumType {

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
    AC_three_phase("AC_three_phase"),
    /**
     * Dc energy transfer mode enum type.
     */
    DC("DC"),
    /**
     * Ac bpt energy transfer mode enum type.
     */
    AC_BPT("AC_BPT"),
    /**
     * Ac bpt der energy transfer mode enum type.
     */
    AC_BPT_DER("AC_BPT_DER"),
    /**
     * Ac der energy transfer mode enum type.
     */
    AC_DER("AC_DER"),
    /**
     * Dc bpt energy transfer mode enum type.
     */
    DC_BPT("DC_BPT"),
    /**
     * Dc acdp energy transfer mode enum type.
     */
    DC_ACDP("DC_ACDP"),
    /**
     * Dc acdp bpt energy transfer mode enum type.
     */
    DC_ACDP_BPT("DC_ACDP_BPT"),
    /**
     * Wpt energy transfer mode enum type.
     */
    WPT("WPT");

    private final String value;

    EnergyTransferModeEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
