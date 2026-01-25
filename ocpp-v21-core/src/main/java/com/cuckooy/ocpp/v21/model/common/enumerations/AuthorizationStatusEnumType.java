package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum AuthorizationStatusEnumType {

    Accepted("Accepted"),
    Blocked("Blocked"),
    ConcurrentTx("ConcurrentTx"),
    Expired("Expired"),
    Invalid("Invalid"),
    NoCredit("NoCredit"),
    NotAllowedTypeEVSE("NotAllowedTypeEVSE"),
    NotAtThisLocation("NotAtThisLocation"),
    NotAtThisTime("NotAtThisTime"),
    Unknown("Unknown");

    private final String value;

    AuthorizationStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
