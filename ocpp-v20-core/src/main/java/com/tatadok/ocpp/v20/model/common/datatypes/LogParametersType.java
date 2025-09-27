package com.tatadok.ocpp.v20.model.common.datatypes;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class LogParametersType {

    private String remoteLocation;
    private ZonedDateTime oldestTimestamp;
    private ZonedDateTime latestTimestamp;
}
