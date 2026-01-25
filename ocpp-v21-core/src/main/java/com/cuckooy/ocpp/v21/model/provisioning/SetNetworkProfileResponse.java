package com.cuckooy.ocpp.v21.model.provisioning;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.SetNetworkProfileStatusEnumType;
import lombok.Data;

@Data
public class SetNetworkProfileResponse implements Response {

    private SetNetworkProfileStatusEnumType status;
    private StatusInfoType statusInfo;
}
