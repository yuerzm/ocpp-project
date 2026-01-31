package com.cuckooy.ocpp.v20.model.provisioning;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.GenericDeviceModelStatusEnumType;
import lombok.Data;

/**
 * The type Get report response.
 */
@Data
public class GetReportResponse implements Response {

    private GenericDeviceModelStatusEnumType status;
    private StatusInfoType statusInfo;
}
