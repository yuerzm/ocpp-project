package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v16.model.security.types.UploadLogStatusEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LogStatusNotificationRequest implements Request {

    private UploadLogStatusEnumType status;
    private Integer requestId;

}
