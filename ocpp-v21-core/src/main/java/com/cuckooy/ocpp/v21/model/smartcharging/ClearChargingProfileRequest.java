package com.cuckooy.ocpp.v21.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.ClearChargingProfileType;
import lombok.Data;

@Data
public class ClearChargingProfileRequest implements Request {

    private Integer chargingProfileId;
    private ClearChargingProfileType chargingProfileCriteria;
}
