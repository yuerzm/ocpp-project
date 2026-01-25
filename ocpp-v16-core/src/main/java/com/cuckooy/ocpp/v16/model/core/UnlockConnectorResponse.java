package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UnlockConnectorResponse implements Response {

    private UnlockStatus status;

    public UnlockConnectorResponse(UnlockStatus status) {
        this.status = status;
    }

}
