package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Message priority enum type.
 */
public enum MessagePriorityEnumType {

    /**
     * Always front message priority enum type.
     */
    AlwaysFront("AlwaysFront"),

    /**
     * In front message priority enum type.
     */
    InFront("InFront"),

    /**
     * Normal cycle message priority enum type.
     */
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
