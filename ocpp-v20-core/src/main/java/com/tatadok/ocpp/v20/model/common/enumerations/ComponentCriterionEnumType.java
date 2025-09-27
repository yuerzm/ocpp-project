package com.tatadok.ocpp.v20.model.common.enumerations;

public enum ComponentCriterionEnumType {

    Active("Active"),

    Available("Available"),

    Enabled("Enabled"),

    Problem("Problem");

    private final String value;

    ComponentCriterionEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
