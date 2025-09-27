package com.tatadok.ocpp.v21.model.common.enumerations;

public enum UnlockStatusEnumType {

    Unlocked("Unlocked"),

    UnlockFailed("UnlockFailed"),

    OngoingAuthorizedTransaction("OngoingAuthorizedTransaction"),

    UnknownConnector("UnknownConnector");

    private final String value;

    UnlockStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
