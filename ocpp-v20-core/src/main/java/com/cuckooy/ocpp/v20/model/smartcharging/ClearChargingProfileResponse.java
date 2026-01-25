package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.ClearChargingProfileStatusEnumType;
import lombok.Data;

@Data
public class ClearChargingProfileResponse implements Response {

    private ClearChargingProfileStatusEnumType status;
    private StatusInfoType statusInfo;
}
