package com.cuckooy.ocpp.v16.model.firmware;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class UpdateFirmwareRequest implements Request {

    private String location;

    private Integer retries;

    private Instant retrieveDate;

    private Integer retryInterval;

    public UpdateFirmwareRequest(String location, Instant retrieveDate) {
        this.location = location;
        this.retrieveDate = retrieveDate;
    }

}
