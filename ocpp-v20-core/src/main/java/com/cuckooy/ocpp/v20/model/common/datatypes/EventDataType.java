package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.EventNotificationEnumType;
import com.cuckooy.ocpp.v20.model.common.enumerations.EventTriggerEnumType;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class EventDataType {

    private Integer eventId;
    private ZonedDateTime timestamp;
    private EventTriggerEnumType trigger;
    private String actualValue;
    private EventNotificationEnumType eventNotificationType;
    private ComponentType component;
    private VariableType variable;
    private Integer cause;
    private String techCode;
    private String techInfo;
    private Boolean cleared;
    private String transactionId;
    private Integer variableMonitoringId;
}
