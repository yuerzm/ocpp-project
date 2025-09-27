package com.tatadok.ocpp.v21.model.smartcharging;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.enumerations.ChargingRateUnitEnumType;
import lombok.Data;

@Data
public class GetCompositeScheduleRequest implements Request {

    private Integer evseId;
    private Integer duration;
    private ChargingRateUnitEnumType chargingRateUnit;
}
