package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Vpn enum type.
 */
public enum VPNEnumType {

    /**
     * Ik ev 2 vpn enum type.
     */
    IKEv2("IKEv2"),
    /**
     * Ip sec vpn enum type.
     */
    IPSec("IPSec"),
    /**
     * L 2 tp vpn enum type.
     */
    L2TP("L2TP"),
    /**
     * Pptp vpn enum type.
     */
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
