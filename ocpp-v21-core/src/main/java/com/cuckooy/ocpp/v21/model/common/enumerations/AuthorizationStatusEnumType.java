package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Authorization status enum type.
 */
public enum AuthorizationStatusEnumType {

    /**
     * Accepted authorization status enum type.
     */
    Accepted("Accepted"),
    /**
     * Blocked authorization status enum type.
     */
    Blocked("Blocked"),
    /**
     * Concurrent tx authorization status enum type.
     */
    ConcurrentTx("ConcurrentTx"),
    /**
     * Expired authorization status enum type.
     */
    Expired("Expired"),
    /**
     * Invalid authorization status enum type.
     */
    Invalid("Invalid"),
    /**
     * No credit authorization status enum type.
     */
    NoCredit("NoCredit"),
    /**
     * Not allowed type evse authorization status enum type.
     */
    NotAllowedTypeEVSE("NotAllowedTypeEVSE"),
    /**
     * Not at this location authorization status enum type.
     */
    NotAtThisLocation("NotAtThisLocation"),
    /**
     * Not at this time authorization status enum type.
     */
    NotAtThisTime("NotAtThisTime"),
    /**
     * Unknown authorization status enum type.
     */
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
