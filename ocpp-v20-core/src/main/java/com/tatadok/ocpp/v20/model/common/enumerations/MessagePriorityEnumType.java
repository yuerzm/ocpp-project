package com.tatadok.ocpp.v20.model.common.enumerations;

public enum MessagePriorityEnumType {

    AlwaysFront("AlwaysFront"),

    InFront("InFront"),

    NormalCycle("NormalCycle");

    private final String value;

    MessagePriorityEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
