package com.tatadok.ocpp.v20.model.common.enumerations;

public enum CostKindEnumType {

    CarbonDioxideEmission("CarbonDioxideEmission"),

    RelativePricePercentage("RelativePricePercentage"),

    RenewableGenerationPercentage("RenewableGenerationPercentage");

    private final String value;

    CostKindEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
