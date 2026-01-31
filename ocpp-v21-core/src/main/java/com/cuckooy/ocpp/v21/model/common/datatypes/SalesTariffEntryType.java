package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.util.List;

/**
 * The type Sales tariff entry type.
 */
@Data
public class SalesTariffEntryType {

    private RelativeTimeIntervalType relativeTimeInterval;
    private Integer ePriceLevel;
    private List<ConsumptionCostType> consumptionCost;
}
