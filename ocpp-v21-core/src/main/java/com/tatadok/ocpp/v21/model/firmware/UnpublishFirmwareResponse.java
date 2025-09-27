package com.tatadok.ocpp.v21.model.firmware;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.enumerations.UnpublishFirmwareStatusEnumType;
import lombok.Data;

@Data
public class UnpublishFirmwareResponse implements Response {

    private UnpublishFirmwareStatusEnumType status;
}
