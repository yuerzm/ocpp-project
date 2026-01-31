package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

/**
 * The type Price level schedule entry type.
 */
@Data
public class PriceLevelScheduleEntryType {

    private Integer duration;
    private Integer priceLevel;
}
