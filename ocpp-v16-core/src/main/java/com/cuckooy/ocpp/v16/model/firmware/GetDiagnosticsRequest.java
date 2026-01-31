package com.cuckooy.ocpp.v16.model.firmware;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * The type Get diagnostics request.
 */
@Data
@NoArgsConstructor
public class GetDiagnosticsRequest implements Request {

    private String location;

    private Integer retries;

    private Integer retryInterval;

    private Instant startTime;

    private Instant stopTime;

    /**
     * Instantiates a new Get diagnostics request.
     *
     * @param location the location
     */
    public GetDiagnosticsRequest(String location) {
        this.location = location;
    }

}
