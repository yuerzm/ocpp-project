package com.tatadok.ocpp.v20.model.diagnostics;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.GenericStatusEnumType;
import lombok.Data;

@Data
public class SetMonitoringLevelResponse implements Response {

    private GenericStatusEnumType status;
    private StatusInfoType statusInfo;
}
