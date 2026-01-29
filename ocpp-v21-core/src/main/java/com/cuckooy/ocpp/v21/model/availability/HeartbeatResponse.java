package com.cuckooy.ocpp.v21.model.availability;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;

import java.time.Instant;

@Data
public class HeartbeatResponse implements Response {

    private Instant currentTime;

    public HeartbeatResponse(Instant currentTime) {
        this.currentTime = currentTime;
    }
}
