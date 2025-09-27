package com.tatadok.ocpp.v20.model.firmware;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.enumerations.PublishFirmwareStatusEnumType;
import lombok.Data;

import java.util.List;

@Data
public class PublishFirmwareStatusNotificationRequest implements Request {

    private PublishFirmwareStatusEnumType status;
    private List<String> location;
    private Integer requestId;
}
