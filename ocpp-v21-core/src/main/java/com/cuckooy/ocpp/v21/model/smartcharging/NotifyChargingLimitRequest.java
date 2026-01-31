package com.cuckooy.ocpp.v21.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.ChargingLimitType;
import com.cuckooy.ocpp.v21.model.common.datatypes.ChargingScheduleType;
import lombok.Data;

import java.util.List;

/**
 * The type Notify charging limit request.
 */
@Data
public class NotifyChargingLimitRequest implements Request {

    private ChargingLimitType chargingLimit;
    private Integer evseId;
    private List<ChargingScheduleType> chargingSchedule;
}
