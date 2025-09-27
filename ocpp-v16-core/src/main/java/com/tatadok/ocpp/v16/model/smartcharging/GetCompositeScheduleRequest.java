package com.tatadok.ocpp.v16.model.smartcharging;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetCompositeScheduleRequest implements Request {

    private Integer connectorId;

    private Integer duration;

    private ChargingRateUnitType chargingRateUnit;

    public GetCompositeScheduleRequest(Integer connectorId, Integer duration) {
        this.connectorId = connectorId;
        this.duration = duration;
    }
}
