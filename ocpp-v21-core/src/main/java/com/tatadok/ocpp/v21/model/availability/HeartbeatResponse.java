package com.tatadok.ocpp.v21.model.availability;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class HeartbeatResponse implements Response {

    private ZonedDateTime currentTime;

    public HeartbeatResponse(ZonedDateTime currentTime) {
        this.currentTime = currentTime;
    }
}
