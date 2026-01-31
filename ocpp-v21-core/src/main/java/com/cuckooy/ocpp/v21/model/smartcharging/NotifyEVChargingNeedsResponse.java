package com.cuckooy.ocpp.v21.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.NotifyEVChargingNeedsStatusEnumType;
import lombok.Data;

/**
 * The type Notify ev charging needs response.
 */
@Data
public class NotifyEVChargingNeedsResponse implements Response {

    private NotifyEVChargingNeedsStatusEnumType status;
    private StatusInfoType statusInfo;

}
