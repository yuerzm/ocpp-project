package com.tatadok.ocpp.v20.model.common.datatypes;

import lombok.Data;

import java.util.List;

@Data
public class ConsumptionCostType {

    private List<CostType> cost;
    private Double startValue;
}
