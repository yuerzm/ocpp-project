package com.cuckooy.ocpp.v21.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.ChargingProfileType;
import lombok.Data;

/**
 * The type Set charging profile request.
 */
@Data
public class SetChargingProfileRequest implements Request {

    private Integer evseId;
    private ChargingProfileType chargingProfile;
}
