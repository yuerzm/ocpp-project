package com.cuckooy.ocpp.v16.model.security.types;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class LogParametersType {

    private String remoteLocation;
    private Instant oldestTimestamp;
    private Instant latestTimestamp;
}
