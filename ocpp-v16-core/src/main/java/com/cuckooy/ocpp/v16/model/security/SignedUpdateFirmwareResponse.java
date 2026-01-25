package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v16.model.security.types.UpdateFirmwareStatusEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignedUpdateFirmwareResponse implements Response {

    private UpdateFirmwareStatusEnumType status;
}
