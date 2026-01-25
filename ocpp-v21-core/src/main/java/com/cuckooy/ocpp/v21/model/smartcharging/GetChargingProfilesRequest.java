package com.cuckooy.ocpp.v21.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.ChargingProfileCriterionType;
import lombok.Data;

@Data
public class GetChargingProfilesRequest implements Request {

    private Integer requestId;
    private ChargingProfileCriterionType chargingProfile;
    private Integer evseId;
}
