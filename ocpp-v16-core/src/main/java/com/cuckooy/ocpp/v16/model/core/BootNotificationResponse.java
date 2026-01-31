package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * The type Boot notification response.
 */
@Data
@NoArgsConstructor
public class BootNotificationResponse implements Response {

    private Instant currentTime;

    private Integer interval;

    private RegistrationStatus status;

    /**
     * Instantiates a new Boot notification response.
     *
     * @param status      the status
     * @param currentTime the current time
     * @param interval    the interval
     */
    public BootNotificationResponse(RegistrationStatus status, Instant currentTime, Integer interval) {
        this.currentTime = currentTime;
        this.interval = interval;
        this.status = status;
    }
}
