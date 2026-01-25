package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v16.model.security.types.FirmwareStatusEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignedFirmwareStatusNotificationRequest implements Request {

    private FirmwareStatusEnumType status;
    private Integer requestId;
}
