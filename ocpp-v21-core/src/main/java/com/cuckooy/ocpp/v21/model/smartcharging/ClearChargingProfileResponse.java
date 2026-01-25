package com.cuckooy.ocpp.v21.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.ClearChargingProfileStatusEnumType;
import lombok.Data;

@Data
public class ClearChargingProfileResponse implements Response {

    private ClearChargingProfileStatusEnumType status;
    private StatusInfoType statusInfo;
}
