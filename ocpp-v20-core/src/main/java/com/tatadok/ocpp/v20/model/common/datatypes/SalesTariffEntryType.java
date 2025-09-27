package com.tatadok.ocpp.v20.model.common.datatypes;

import lombok.Data;

import java.util.List;

@Data
public class SalesTariffEntryType {

    private RelativeTimeIntervalType relativeTimeInterval;
    private Integer ePriceLevel;
    private List<ConsumptionCostType> consumptionCost;
}
