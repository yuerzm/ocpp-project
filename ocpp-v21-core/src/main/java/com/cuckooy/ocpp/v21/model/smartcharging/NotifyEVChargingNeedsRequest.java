package com.cuckooy.ocpp.v21.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.ChargingNeedsType;
import lombok.Data;

/**
 * The type Notify ev charging needs request.
 */
@Data
public class NotifyEVChargingNeedsRequest implements Request {

    private Integer evseId;
    private ChargingNeedsType chargingNeeds;
    private Integer maxScheduleTuples;
}
