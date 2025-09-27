package com.tatadok.ocpp.v21.model.provisioning;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.ResetStatusEnumType;
import lombok.Data;

@Data
public class ResetResponse implements Response {

    private ResetStatusEnumType status;
    private StatusInfoType statusInfo;
}
