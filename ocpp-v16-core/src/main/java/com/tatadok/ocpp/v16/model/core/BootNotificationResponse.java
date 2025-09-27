package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class BootNotificationResponse implements Response {

    private ZonedDateTime currentTime;

    private Integer interval;

    private RegistrationStatus status;

    public BootNotificationResponse(RegistrationStatus status, ZonedDateTime currentTime, Integer interval) {
        this.currentTime = currentTime;
        this.interval = interval;
        this.status = status;
    }
}
