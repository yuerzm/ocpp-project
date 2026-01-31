package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.Instant;

/**
 * The type Price level schedule type.
 */
@Data
public class PriceLevelScheduleType {

    private Instant timeAnchor;
    private Integer priceScheduleId;
    private String priceScheduleDescription;
    private Integer numberOfPriceLevels;
    private PriceLevelScheduleEntryType priceLevelScheduleEntries;

}
