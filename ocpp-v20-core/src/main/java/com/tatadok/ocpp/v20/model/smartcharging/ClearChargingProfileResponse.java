package com.tatadok.ocpp.v20.model.smartcharging;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.ClearChargingProfileStatusEnumType;
import lombok.Data;

@Data
public class ClearChargingProfileResponse implements Response {

    private ClearChargingProfileStatusEnumType status;
    private StatusInfoType statusInfo;
}
