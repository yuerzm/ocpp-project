package com.cuckooy.ocpp.v21.model.provisioning;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.GenericDeviceModelStatusEnumType;
import lombok.Data;

/**
 * The type Get base report response.
 */
@Data
public class GetBaseReportResponse implements Response {

    private GenericDeviceModelStatusEnumType status;
    private StatusInfoType statusInfo;
}
