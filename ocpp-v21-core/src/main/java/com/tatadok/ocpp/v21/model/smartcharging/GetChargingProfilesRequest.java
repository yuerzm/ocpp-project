package com.tatadok.ocpp.v21.model.smartcharging;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.ChargingProfileCriterionType;
import lombok.Data;

@Data
public class GetChargingProfilesRequest implements Request {

    private Integer requestId;
    private ChargingProfileCriterionType chargingProfile;
    private Integer evseId;
}
