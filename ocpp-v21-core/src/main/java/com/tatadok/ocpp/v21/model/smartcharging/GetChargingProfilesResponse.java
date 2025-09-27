package com.tatadok.ocpp.v21.model.smartcharging;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.GetChargingProfileStatusEnumType;
import lombok.Data;

@Data
public class GetChargingProfilesResponse implements Response {

    private GetChargingProfileStatusEnumType status;
    private StatusInfoType statusInfo;
}
