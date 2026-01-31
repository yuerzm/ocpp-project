package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.ChargingScheduleType;
import lombok.Data;

import java.time.Instant;

/**
 * The type Notify ev charging schedule request.
 */
@Data
public class NotifyEVChargingScheduleRequest implements Request {

    private Instant timeBase;
    private Integer evseId;
    private ChargingScheduleType chargingSchedule;
}
