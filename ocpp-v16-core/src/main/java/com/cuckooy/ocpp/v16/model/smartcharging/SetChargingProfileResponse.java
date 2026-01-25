package com.cuckooy.ocpp.v16.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SetChargingProfileResponse implements Response {

    private ChargingProfileStatus status;

    public SetChargingProfileResponse(ChargingProfileStatus status) {
        this.status = status;
    }

}
