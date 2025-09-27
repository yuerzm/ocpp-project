package com.tatadok.ocpp.v21.model.common.enumerations;

public enum TariffCostEnumType {

    NormalCost("NormalCost"),
    MinCost("MinCost"),
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
