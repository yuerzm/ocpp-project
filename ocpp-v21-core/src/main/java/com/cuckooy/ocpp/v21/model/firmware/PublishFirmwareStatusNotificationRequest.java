package com.cuckooy.ocpp.v21.model.firmware;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.enumerations.PublishFirmwareStatusEnumType;
import lombok.Data;

import java.util.List;

@Data
public class PublishFirmwareStatusNotificationRequest implements Request {

    private PublishFirmwareStatusEnumType status;
    private List<String> location;
    private Integer requestId;
}
