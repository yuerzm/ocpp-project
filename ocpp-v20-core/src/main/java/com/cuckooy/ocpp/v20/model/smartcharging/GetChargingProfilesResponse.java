package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.GetChargingProfileStatusEnumType;
import lombok.Data;

/**
 * The type Get charging profiles response.
 */
@Data
public class GetChargingProfilesResponse implements Response {

    private GetChargingProfileStatusEnumType status;
    private StatusInfoType statusInfo;
}
