package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.GenericStatusEnumType;
import lombok.Data;

@Data
public class SetMonitoringLevelResponse implements Response {

    private GenericStatusEnumType status;
    private StatusInfoType statusInfo;
}
