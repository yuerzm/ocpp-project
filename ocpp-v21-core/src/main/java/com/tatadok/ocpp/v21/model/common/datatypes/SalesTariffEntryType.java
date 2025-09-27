package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.util.List;

@Data
public class SalesTariffEntryType {

    private RelativeTimeIntervalType relativeTimeInterval;
    private Integer ePriceLevel;
    private List<ConsumptionCostType> consumptionCost;
}
