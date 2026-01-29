package com.cuckooy.ocpp.v16.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v16.model.core.ChargingSchedule;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class GetCompositeScheduleResponse implements Response {

    private GetCompositeScheduleStatus status;

    private Integer connectorId;

    private Instant scheduleStart;

    private ChargingSchedule chargingSchedule;

}
