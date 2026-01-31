package com.cuckooy.ocpp.v21.model.common.datatypes;

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
