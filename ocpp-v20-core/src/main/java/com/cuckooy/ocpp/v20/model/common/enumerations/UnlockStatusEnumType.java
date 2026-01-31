package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Unlock status enum type.
 */
public enum UnlockStatusEnumType {

    /**
     * Unlocked unlock status enum type.
     */
    Unlocked("Unlocked"),

    /**
     * Unlock failed unlock status enum type.
     */
    UnlockFailed("UnlockFailed"),

    /**
     * Ongoing authorized transaction unlock status enum type.
     */
    OngoingAuthorizedTransaction("OngoingAuthorizedTransaction"),

    /**
     * Unknown connector unlock status enum type.
     */
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
