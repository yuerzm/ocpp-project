package com.cuckooy.ocpp.v20.model.firmware;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.UpdateFirmwareStatusEnumType;
import lombok.Data;

/**
 * The type Update firmware response.
 */
@Data
public class UpdateFirmwareResponse implements Response {

    private UpdateFirmwareStatusEnumType status;
    private StatusInfoType statusInfo;
}
