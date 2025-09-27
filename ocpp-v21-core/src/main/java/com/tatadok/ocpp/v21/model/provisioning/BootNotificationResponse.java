package com.tatadok.ocpp.v21.model.provisioning;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.RegistrationStatusEnumType;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class BootNotificationResponse implements Response {

    private ZonedDateTime currentTime;
    private Integer interval;
    private RegistrationStatusEnumType status;
    private StatusInfoType statusInfo;

}
