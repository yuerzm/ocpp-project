package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.enumerations.ChargingLimitSourceEnumType;
import lombok.Data;

/**
 * The type Cleared charging limit request.
 */
@Data
public class ClearedChargingLimitRequest implements Request {

    private ChargingLimitSourceEnumType chargingLimitSource;
    private Integer evseId;

}
