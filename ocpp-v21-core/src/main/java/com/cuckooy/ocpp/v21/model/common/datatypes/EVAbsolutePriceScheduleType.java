package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class EVAbsolutePriceScheduleType {

    private ZonedDateTime timeAnchor;
    private String currency;
    private String priceAlgorithm;
    private List<EVAbsolutePriceScheduleEntryType> evAbsolutePriceScheduleEntries;
}
