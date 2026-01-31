package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.enumerations.ChargingRateUnitEnumType;
import lombok.Data;

/**
 * The type Get composite schedule request.
 */
@Data
public class GetCompositeScheduleRequest implements Request {

    private Integer evseId;
    private Integer duration;
    private ChargingRateUnitEnumType chargingRateUnit;
}
