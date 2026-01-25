package com.cuckooy.ocpp.v21.model.firmware;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.UpdateFirmwareStatusEnumType;
import lombok.Data;

@Data
public class UpdateFirmwareResponse implements Response {

    private UpdateFirmwareStatusEnumType status;
    private StatusInfoType statusInfo;
}
