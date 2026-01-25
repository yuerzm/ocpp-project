package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.ChargingScheduleType;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class NotifyEVChargingScheduleRequest implements Request {

    private ZonedDateTime timeBase;
    private Integer evseId;
    private ChargingScheduleType chargingSchedule;
}
