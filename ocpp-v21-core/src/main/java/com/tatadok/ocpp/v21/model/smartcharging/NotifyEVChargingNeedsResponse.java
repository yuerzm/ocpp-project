package com.tatadok.ocpp.v21.model.smartcharging;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.NotifyEVChargingNeedsStatusEnumType;
import lombok.Data;

@Data
public class NotifyEVChargingNeedsResponse implements Response {

    private NotifyEVChargingNeedsStatusEnumType status;
    private StatusInfoType statusInfo;

}
