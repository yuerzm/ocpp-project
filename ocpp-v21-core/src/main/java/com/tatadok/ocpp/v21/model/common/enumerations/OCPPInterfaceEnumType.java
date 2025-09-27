package com.tatadok.ocpp.v21.model.common.enumerations;

public enum OCPPInterfaceEnumType {

    Wired0("Wired0"),
    Wired1("Wired1"),
    Wired2("Wired2"),
    Wired3("Wired3"),
    Wireless0("Wireless0"),
    Wireless1("Wireless1"),
    Wireless2("Wireless2"),
    Wireless3("Wireless3"),
    Any("Any"),
    ;

    private final String value;

    OCPPInterfaceEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
