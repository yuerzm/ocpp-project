package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Tariff cost enum type.
 */
public enum TariffCostEnumType {

    /**
     * Normal cost tariff cost enum type.
     */
    NormalCost("NormalCost"),
    /**
     * Min cost tariff cost enum type.
     */
    MinCost("MinCost"),
    /**
     * Max cost tariff cost enum type.
     */
    MaxCost("MaxCost"),
    ;

    private final String value;

    TariffCostEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
