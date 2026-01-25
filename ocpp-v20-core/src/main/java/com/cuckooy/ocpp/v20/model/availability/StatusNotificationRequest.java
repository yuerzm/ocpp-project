package com.cuckooy.ocpp.v20.model.availability;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.enumerations.ConnectorStatusEnumType;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class StatusNotificationRequest implements Request {

    private Integer connectorId;
    private ConnectorStatusEnumType connectorStatus;
    private Integer evseId;
    private ZonedDateTime timestamp;
}
