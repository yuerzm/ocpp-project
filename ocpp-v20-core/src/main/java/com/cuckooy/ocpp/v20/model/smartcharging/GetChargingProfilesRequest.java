package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.ChargingProfileCriterionType;
import lombok.Data;

/**
 * The type Get charging profiles request.
 */
@Data
public class GetChargingProfilesRequest implements Request {

    private Integer requestId;
    private ChargingProfileCriterionType chargingProfile;
    private Integer evseId;
}
