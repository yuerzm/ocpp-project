package com.tatadok.ocpp.v21.model.common.enumerations;

public enum VPNEnumType {

    IKEv2("IKEv2"),
    IPSec("IPSec"),
    L2TP("L2TP"),
    PPTP("PPTP");

    private final String value;

    VPNEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
