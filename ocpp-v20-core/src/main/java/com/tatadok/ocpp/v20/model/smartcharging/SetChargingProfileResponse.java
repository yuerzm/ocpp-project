package com.tatadok.ocpp.v20.model.smartcharging;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.ChargingProfileStatusEnumType;
import lombok.Data;

@Data
public class SetChargingProfileResponse implements Response {

    private ChargingProfileStatusEnumType status;
    private StatusInfoType statusInfo;
}
