package com.cuckooy.ocpp.v16.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Set charging profile response.
 */
@Data
@NoArgsConstructor
public class SetChargingProfileResponse implements Response {

    private ChargingProfileStatus status;

    /**
     * Instantiates a new Set charging profile response.
     *
     * @param status the status
     */
    public SetChargingProfileResponse(ChargingProfileStatus status) {
        this.status = status;
    }

}
