package com.tatadok.ocpp.v16.model.firmware;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class GetDiagnosticsRequest implements Request {

    private String location;

    private Integer retries;

    private Integer retryInterval;

    private ZonedDateTime startTime;

    private ZonedDateTime stopTime;

    public GetDiagnosticsRequest(String location) {
        this.location = location;
    }

}
