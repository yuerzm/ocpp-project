package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Response;
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
