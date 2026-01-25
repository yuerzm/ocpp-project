package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum EnergyTransferModeEnumType {

    AC_single_phase("AC_single_phase"),
    AC_two_phase("AC_two_phase"),
    AC_three_phase("AC_three_phase"),
    DC("DC"),
    AC_BPT("AC_BPT"),
    AC_BPT_DER("AC_BPT_DER"),
    AC_DER("AC_DER"),
    DC_BPT("DC_BPT"),
    DC_ACDP("DC_ACDP"),
    DC_ACDP_BPT("DC_ACDP_BPT"),
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
