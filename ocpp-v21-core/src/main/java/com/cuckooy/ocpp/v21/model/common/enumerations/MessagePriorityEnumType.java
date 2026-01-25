package com.cuckooy.ocpp.v21.model.common.enumerations;

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
