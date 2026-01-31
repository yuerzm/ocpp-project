package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

import java.util.List;

/**
 * The type Consumption cost type.
 */
@Data
public class ConsumptionCostType {

    private List<CostType> cost;
    private Double startValue;
}
