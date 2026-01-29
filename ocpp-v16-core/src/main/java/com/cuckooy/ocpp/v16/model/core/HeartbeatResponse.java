package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class HeartbeatResponse implements Response {

    private Instant currentTime;

    public HeartbeatResponse(Instant currentTime) {
        this.currentTime = currentTime;
    }
}
