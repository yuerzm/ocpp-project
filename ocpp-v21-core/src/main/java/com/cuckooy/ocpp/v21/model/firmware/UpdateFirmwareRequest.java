package com.cuckooy.ocpp.v21.model.firmware;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.FirmwareType;
import lombok.Data;

/**
 * The type Update firmware request.
 */
@Data
public class UpdateFirmwareRequest implements Request {

    private Integer retries;
    private Integer retryInterval;
    private Integer requestId;
    private FirmwareType firmware;
}
