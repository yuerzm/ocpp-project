package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.ChargingLimitType;
import com.cuckooy.ocpp.v20.model.common.datatypes.ChargingScheduleType;
import lombok.Data;

import java.util.List;

@Data
public class NotifyChargingLimitRequest implements Request {

    private ChargingLimitType chargingLimit;
    private Integer evseId;
    private List<ChargingScheduleType> chargingSchedule;
}
