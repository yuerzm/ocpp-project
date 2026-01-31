package com.cuckooy.ocpp.v16.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Clear charging profile response.
 */
@Data
@NoArgsConstructor
public class ClearChargingProfileResponse implements Response {

    private ClearChargingProfileStatus status;

}
