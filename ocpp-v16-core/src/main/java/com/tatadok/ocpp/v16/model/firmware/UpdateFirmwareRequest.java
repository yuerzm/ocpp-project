package com.tatadok.ocpp.v16.model.firmware;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class UpdateFirmwareRequest implements Request {

    private String location;

    private Integer retries;

    private ZonedDateTime retrieveDate;

    private Integer retryInterval;

    public UpdateFirmwareRequest(String location, ZonedDateTime retrieveDate) {
        this.location = location;
        this.retrieveDate = retrieveDate;
    }

}
