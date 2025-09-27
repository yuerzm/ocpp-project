package com.tatadok.ocpp.v21.model.smartcharging;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.ClearChargingProfileType;
import lombok.Data;

@Data
public class ClearChargingProfileRequest implements Request {

    private Integer chargingProfileId;
    private ClearChargingProfileType chargingProfileCriteria;
}
