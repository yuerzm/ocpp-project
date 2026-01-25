package com.cuckooy.ocpp.v16.model.security.types;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class LogParametersType {

    private String remoteLocation;
    private ZonedDateTime oldestTimestamp;
    private ZonedDateTime latestTimestamp;
}
