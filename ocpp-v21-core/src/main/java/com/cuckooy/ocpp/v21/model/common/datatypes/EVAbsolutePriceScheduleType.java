package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
public class EVAbsolutePriceScheduleType {

    private Instant timeAnchor;
    private String currency;
    private String priceAlgorithm;
    private List<EVAbsolutePriceScheduleEntryType> evAbsolutePriceScheduleEntries;
}
