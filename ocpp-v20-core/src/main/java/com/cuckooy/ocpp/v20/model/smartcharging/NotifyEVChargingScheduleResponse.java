package com.cuckooy.ocpp.v20.model.smartcharging;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.GenericStatusEnumType;
import lombok.Data;

/**
 * The type Notify ev charging schedule response.
 */
@Data
public class NotifyEVChargingScheduleResponse implements Response {

    private GenericStatusEnumType status;
    private StatusInfoType statusInfo;
}
