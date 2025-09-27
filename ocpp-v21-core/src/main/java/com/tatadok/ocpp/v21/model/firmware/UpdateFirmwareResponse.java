package com.tatadok.ocpp.v21.model.firmware;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.UpdateFirmwareStatusEnumType;
import lombok.Data;

@Data
public class UpdateFirmwareResponse implements Response {

    private UpdateFirmwareStatusEnumType status;
    private StatusInfoType statusInfo;
}
