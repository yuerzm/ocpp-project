package com.tatadok.ocpp.v20.model.availability;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.enumerations.ConnectorStatusEnumType;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class StatusNotificationRequest implements Request {

    private Integer connectorId;
    private ConnectorStatusEnumType connectorStatus;
    private Integer evseId;
    private ZonedDateTime timestamp;
}
