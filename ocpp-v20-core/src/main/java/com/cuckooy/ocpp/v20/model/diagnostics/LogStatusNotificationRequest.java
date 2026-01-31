package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.enumerations.UploadLogStatusEnumType;
import lombok.Data;

/**
 * The type Log status notification request.
 */
@Data
public class LogStatusNotificationRequest implements Request {

    private UploadLogStatusEnumType status;
    private Integer requestId;
}
