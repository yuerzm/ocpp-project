package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class BootNotificationResponse implements Response {

    private Instant currentTime;

    private Integer interval;

    private RegistrationStatus status;

    public BootNotificationResponse(RegistrationStatus status, Instant currentTime, Integer interval) {
        this.currentTime = currentTime;
        this.interval = interval;
        this.status = status;
    }
}
