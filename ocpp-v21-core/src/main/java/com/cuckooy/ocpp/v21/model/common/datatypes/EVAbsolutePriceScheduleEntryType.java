package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.util.List;

/**
 * The type Ev absolute price schedule entry type.
 */
@Data
public class EVAbsolutePriceScheduleEntryType {

    private Integer duration;
    private List<EVPriceRuleType> evPriceRule;
}
