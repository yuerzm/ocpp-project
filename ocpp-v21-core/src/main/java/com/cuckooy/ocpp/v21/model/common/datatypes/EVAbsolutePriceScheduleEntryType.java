package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.util.List;

@Data
public class EVAbsolutePriceScheduleEntryType {

    private Integer duration;
    private List<EVPriceRuleType> evPriceRule;
}
