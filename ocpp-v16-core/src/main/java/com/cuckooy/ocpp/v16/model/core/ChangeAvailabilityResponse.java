package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChangeAvailabilityResponse implements Response {

    private AvailabilityStatus status;

    public ChangeAvailabilityResponse(AvailabilityStatus status) {
        this.status = status;
    }

}
