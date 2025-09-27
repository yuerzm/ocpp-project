package com.tatadok.ocpp.v20.model.firmware;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.UpdateFirmwareStatusEnumType;
import lombok.Data;

@Data
public class UpdateFirmwareResponse implements Response {

    private UpdateFirmwareStatusEnumType status;
    private StatusInfoType statusInfo;
}
