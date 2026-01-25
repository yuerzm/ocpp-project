package com.cuckooy.ocpp.v21.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.GetChargingProfileStatusEnumType;
import lombok.Data;

@Data
public class GetChargingProfilesResponse implements Response {

    private GetChargingProfileStatusEnumType status;
    private StatusInfoType statusInfo;
}
