package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Cost kind enum type.
 */
public enum CostKindEnumType {

    /**
     * Carbon dioxide emission cost kind enum type.
     */
    CarbonDioxideEmission("CarbonDioxideEmission"),

    /**
     * Relative price percentage cost kind enum type.
     */
    RelativePricePercentage("RelativePricePercentage"),

    /**
     * Renewable generation percentage cost kind enum type.
     */
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
