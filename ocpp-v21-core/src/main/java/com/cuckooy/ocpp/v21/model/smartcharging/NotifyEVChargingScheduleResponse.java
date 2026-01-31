package com.cuckooy.ocpp.v21.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.GenericStatusEnumType;
import lombok.Data;

/**
 * The type Notify ev charging schedule response.
 */
@Data
public class NotifyEVChargingScheduleResponse implements Response {

    private GenericStatusEnumType status;
    private StatusInfoType statusInfo;
}
