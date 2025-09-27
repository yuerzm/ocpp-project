package com.tatadok.ocpp.v20.model.smartcharging;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.GenericStatusEnumType;
import lombok.Data;

@Data
public class NotifyEVChargingScheduleResponse implements Response {

    private GenericStatusEnumType status;
    private StatusInfoType statusInfo;
}
