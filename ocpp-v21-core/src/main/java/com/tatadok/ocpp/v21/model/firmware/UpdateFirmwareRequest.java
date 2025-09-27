package com.tatadok.ocpp.v21.model.firmware;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.FirmwareType;
import lombok.Data;

@Data
public class UpdateFirmwareRequest implements Request {

    private Integer retries;
    private Integer retryInterval;
    private Integer requestId;
    private FirmwareType firmware;
}
