package com.tatadok.ocpp.v21.model.common.enumerations;

public enum DataEnumType {

    STRING("string"),

    DECIMAL("decimal"),

    INTEGER("integer"),

    DateTime("dateTime"),

    BOOLEAN("boolean"),

    OptionList("OptionList"),

    SequenceList("SequenceList"),

    MemberList("MemberList");

    private final String value;

    DataEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
