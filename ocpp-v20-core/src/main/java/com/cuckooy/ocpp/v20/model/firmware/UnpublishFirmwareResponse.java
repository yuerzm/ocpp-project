package com.cuckooy.ocpp.v20.model.firmware;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.enumerations.UnpublishFirmwareStatusEnumType;
import lombok.Data;

@Data
public class UnpublishFirmwareResponse implements Response {

    private UnpublishFirmwareStatusEnumType status;
}
