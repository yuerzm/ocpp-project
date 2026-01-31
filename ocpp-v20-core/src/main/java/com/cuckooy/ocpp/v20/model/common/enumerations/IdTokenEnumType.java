package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Id token enum type.
 */
public enum IdTokenEnumType {

    /**
     * Central id token enum type.
     */
    Central("Central"),
    /**
     * E maid id token enum type.
     */
    eMAID("eMAID"),
    /**
     * Iso 14443 id token enum type.
     */
    ISO14443("ISO14443"),
    /**
     * Iso 15693 id token enum type.
     */
    ISO15693("ISO15693"),
    /**
     * Key code id token enum type.
     */
    KeyCode("KeyCode"),
    /**
     * Local id token enum type.
     */
    Local("Local"),
    /**
     * Mac address id token enum type.
     */
    MacAddress("MacAddress"),
    /**
     * No authorization id token enum type.
     */
    NoAuthorization("NoAuthorization");

    private final String value;

    IdTokenEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
