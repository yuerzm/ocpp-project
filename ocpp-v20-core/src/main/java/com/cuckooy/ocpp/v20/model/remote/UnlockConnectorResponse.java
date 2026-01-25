package com.cuckooy.ocpp.v20.model.remote;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.UnlockStatusEnumType;
import lombok.Data;

@Data
public class UnlockConnectorResponse implements Response {

    private UnlockStatusEnumType status;
    private StatusInfoType statusInfo;
}
