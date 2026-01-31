package com.cuckooy.ocpp.v16.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Get composite schedule request.
 */
@Data
@NoArgsConstructor
public class GetCompositeScheduleRequest implements Request {

    private Integer connectorId;

    private Integer duration;

    private ChargingRateUnitType chargingRateUnit;

    /**
     * Instantiates a new Get composite schedule request.
     *
     * @param connectorId the connector id
     * @param duration    the duration
     */
    public GetCompositeScheduleRequest(Integer connectorId, Integer duration) {
        this.connectorId = connectorId;
        this.duration = duration;
    }
}
