package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.GenericDeviceModelStatusEnumType;
import lombok.Data;

/**
 * The type Get monitoring report response.
 */
@Data
public class GetMonitoringReportResponse implements Response {

    private GenericDeviceModelStatusEnumType status;
    private StatusInfoType statusInfo;
}
