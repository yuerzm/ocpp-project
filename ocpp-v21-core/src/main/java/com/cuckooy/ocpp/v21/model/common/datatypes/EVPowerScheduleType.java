package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
public class EVPowerScheduleType {

    private Instant timeAnchor;
    private List<EVPowerScheduleEntryType> evPowerScheduleEntries;
}
