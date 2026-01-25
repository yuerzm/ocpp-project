package com.cuckooy.ocpp.v20.model.provisioning;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.RegistrationStatusEnumType;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class BootNotificationResponse implements Response {

    private ZonedDateTime currentTime;
    private Integer interval;
    private RegistrationStatusEnumType status;
    private StatusInfoType statusInfo;

}
