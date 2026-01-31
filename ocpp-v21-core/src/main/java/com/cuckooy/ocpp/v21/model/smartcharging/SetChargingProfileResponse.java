package com.cuckooy.ocpp.v21.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.ChargingProfileStatusEnumType;
import lombok.Data;

/**
 * The type Set charging profile response.
 */
@Data
public class SetChargingProfileResponse implements Response {

    private ChargingProfileStatusEnumType status;
    private StatusInfoType statusInfo;
}
