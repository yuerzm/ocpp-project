package com.tatadok.ocpp.v16.model.firmware;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FirmwareStatusNotificationRequest implements Request {

    private FirmwareStatus status;

}
