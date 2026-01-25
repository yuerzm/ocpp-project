package com.cuckooy.ocpp.v21.model.remote;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

@Data
public class UnlockConnectorRequest implements Request {

    private Integer connectorId;
    private Integer evseId;
}
