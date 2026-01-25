package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.ChargingProfileStatusEnumType;
import lombok.Data;

@Data
public class SetChargingProfileResponse implements Response {

    private ChargingProfileStatusEnumType status;
    private StatusInfoType statusInfo;
}
