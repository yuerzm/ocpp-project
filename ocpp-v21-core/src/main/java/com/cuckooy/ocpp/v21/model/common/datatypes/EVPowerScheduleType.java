package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class EVPowerScheduleType {

    private ZonedDateTime timeAnchor;
    private List<EVPowerScheduleEntryType> evPowerScheduleEntries;
}
