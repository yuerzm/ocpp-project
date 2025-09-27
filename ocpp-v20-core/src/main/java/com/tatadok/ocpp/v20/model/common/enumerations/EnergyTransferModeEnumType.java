package com.tatadok.ocpp.v20.model.common.enumerations;

public enum EnergyTransferModeEnumType {

    DC("DC"),

    AC_single_phase("AC_single_phase"),

    AC_two_phase("AC_two_phase"),

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
