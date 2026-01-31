package com.cuckooy.ocpp.v16.model.firmware;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Firmware status notification request.
 */
@Data
@NoArgsConstructor
public class FirmwareStatusNotificationRequest implements Request {

    private FirmwareStatus status;

}
