package com.tatadok.ocpp.v21.model.smartcharging;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.ChargingLimitType;
import com.tatadok.ocpp.v21.model.common.datatypes.ChargingScheduleType;
import lombok.Data;

import java.util.List;

@Data
public class NotifyChargingLimitRequest implements Request {

    private ChargingLimitType chargingLimit;
    private Integer evseId;
    private List<ChargingScheduleType> chargingSchedule;
}
