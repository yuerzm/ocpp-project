package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Change availability response.
 */
@Data
@NoArgsConstructor
public class ChangeAvailabilityResponse implements Response {

    private AvailabilityStatus status;

    /**
     * Instantiates a new Change availability response.
     *
     * @param status the status
     */
    public ChangeAvailabilityResponse(AvailabilityStatus status) {
        this.status = status;
    }

}
