package com.tatadok.ocpp.v20.model.provisioning;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.SetNetworkProfileStatusEnumType;
import lombok.Data;

@Data
public class SetNetworkProfileResponse implements Response {

    private SetNetworkProfileStatusEnumType status;
    private StatusInfoType statusInfo;
}
