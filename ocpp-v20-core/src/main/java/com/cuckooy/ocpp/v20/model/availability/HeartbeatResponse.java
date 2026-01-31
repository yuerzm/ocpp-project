package com.cuckooy.ocpp.v20.model.availability;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;

import java.time.Instant;

/**
 * The type Heartbeat response.
 */
@Data
public class HeartbeatResponse implements Response {

    private Instant currentTime;

    /**
     * Instantiates a new Heartbeat response.
     *
     * @param currentTime the current time
     */
    public HeartbeatResponse(Instant currentTime) {
        this.currentTime = currentTime;
    }
}
