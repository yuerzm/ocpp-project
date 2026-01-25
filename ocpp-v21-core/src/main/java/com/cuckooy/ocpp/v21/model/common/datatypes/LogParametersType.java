package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class LogParametersType {

    private String remoteLocation;
    private ZonedDateTime oldestTimestamp;
    private ZonedDateTime latestTimestamp;
}
