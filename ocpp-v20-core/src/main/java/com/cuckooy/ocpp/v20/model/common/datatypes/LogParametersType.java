package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

import java.time.Instant;

@Data
public class LogParametersType {

    private String remoteLocation;
    private Instant oldestTimestamp;
    private Instant latestTimestamp;
}
