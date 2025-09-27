package com.tatadok.ocpp.v20.model.smartcharging;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.datatypes.ChargingNeedsType;
import lombok.Data;

@Data
public class NotifyEVChargingNeedsRequest implements Request {

    private Integer evseId;
    private ChargingNeedsType chargingNeeds;
    private Integer maxScheduleTuples;
}
