package com.tatadok.ocpp.v21.model.smartcharging;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.ChargingProfileType;
import lombok.Data;

@Data
public class SetChargingProfileRequest implements Request {

    private Integer evseId;
    private ChargingProfileType chargingProfile;
}
