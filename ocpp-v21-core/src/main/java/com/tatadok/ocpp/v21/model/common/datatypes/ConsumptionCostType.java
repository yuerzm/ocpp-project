package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.util.List;

@Data
public class ConsumptionCostType {

    private List<CostType> cost;
    private Double startValue;
}
