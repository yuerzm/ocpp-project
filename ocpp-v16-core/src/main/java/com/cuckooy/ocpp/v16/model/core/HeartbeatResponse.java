package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class HeartbeatResponse implements Response {

    private ZonedDateTime currentTime;

    public HeartbeatResponse(ZonedDateTime currentTime) {
        this.currentTime = currentTime;
    }
}
