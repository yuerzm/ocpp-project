package com.cuckooy.ocpp.v20.model.firmware;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.enumerations.FirmwareStatusEnumType;
import lombok.Data;

@Data
public class FirmwareStatusNotificationRequest implements Request {

    private FirmwareStatusEnumType status;
    private Integer requestId;
}
