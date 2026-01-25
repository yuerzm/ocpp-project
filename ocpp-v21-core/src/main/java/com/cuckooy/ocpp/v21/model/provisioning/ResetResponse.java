package com.cuckooy.ocpp.v21.model.provisioning;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.ResetStatusEnumType;
import lombok.Data;

@Data
public class ResetResponse implements Response {

    private ResetStatusEnumType status;
    private StatusInfoType statusInfo;
}
