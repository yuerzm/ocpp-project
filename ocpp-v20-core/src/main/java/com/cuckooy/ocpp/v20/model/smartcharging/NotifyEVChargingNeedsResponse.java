package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.NotifyEVChargingNeedsStatusEnumType;
import lombok.Data;

/**
 * The type Notify ev charging needs response.
 */
@Data
public class NotifyEVChargingNeedsResponse implements Response {

    private NotifyEVChargingNeedsStatusEnumType status;
    private StatusInfoType statusInfo;

}
