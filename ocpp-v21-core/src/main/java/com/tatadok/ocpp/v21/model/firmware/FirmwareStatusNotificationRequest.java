package com.tatadok.ocpp.v21.model.firmware;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.enumerations.FirmwareStatusEnumType;
import lombok.Data;

@Data
public class FirmwareStatusNotificationRequest implements Request {

    private FirmwareStatusEnumType status;
    private Integer requestId;
}
