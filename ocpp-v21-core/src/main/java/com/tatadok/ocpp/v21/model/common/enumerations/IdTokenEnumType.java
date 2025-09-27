package com.tatadok.ocpp.v21.model.common.enumerations;

public enum IdTokenEnumType {

    Central("Central"),
    eMAID("eMAID"),
    ISO14443("ISO14443"),
    ISO15693("ISO15693"),
    KeyCode("KeyCode"),
    Local("Local"),
    MacAddress("MacAddress"),
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
