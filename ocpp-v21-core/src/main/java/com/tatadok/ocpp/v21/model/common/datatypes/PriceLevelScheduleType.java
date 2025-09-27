package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class PriceLevelScheduleType {

    private ZonedDateTime timeAnchor;
    private Integer priceScheduleId;
    private String priceScheduleDescription;
    private Integer numberOfPriceLevels;
    private PriceLevelScheduleEntryType priceLevelScheduleEntries;

}
