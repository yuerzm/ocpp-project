package com.cuckooy.ocpp.v21.model.diagnostics;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.GenericDeviceModelStatusEnumType;
import lombok.Data;

/**
 * The type Set monitoring base response.
 */
@Data
public class SetMonitoringBaseResponse implements Response {

    private GenericDeviceModelStatusEnumType status;
    private StatusInfoType statusInfo;
}
