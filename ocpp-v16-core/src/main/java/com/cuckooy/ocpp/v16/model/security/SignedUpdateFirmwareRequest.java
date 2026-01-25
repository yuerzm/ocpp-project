package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v16.model.security.types.FirmwareType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignedUpdateFirmwareRequest implements Request {

    private Integer retries;
    private Integer retryInterval;
    private Integer requestId;
    private FirmwareType firmware;
}
