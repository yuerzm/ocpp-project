package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.Instant;

@Data
public class PriceLevelScheduleType {

    private Instant timeAnchor;
    private Integer priceScheduleId;
    private String priceScheduleDescription;
    private Integer numberOfPriceLevels;
    private PriceLevelScheduleEntryType priceLevelScheduleEntries;

}
