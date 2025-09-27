package com.tatadok.ocpp.v20.model.diagnostics;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.enumerations.UploadLogStatusEnumType;
import lombok.Data;

@Data
public class LogStatusNotificationRequest implements Request {

    private UploadLogStatusEnumType status;
    private Integer requestId;
}
