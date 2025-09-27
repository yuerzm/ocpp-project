package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UnlockConnectorRequest implements Request {

    private Integer connectorId;

    public UnlockConnectorRequest(Integer connectorId) {
        this.connectorId = connectorId;
    }

}
