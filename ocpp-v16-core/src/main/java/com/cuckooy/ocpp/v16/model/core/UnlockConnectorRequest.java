package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Unlock connector request.
 */
@Data
@NoArgsConstructor
public class UnlockConnectorRequest implements Request {

    private Integer connectorId;

    /**
     * Instantiates a new Unlock connector request.
     *
     * @param connectorId the connector id
     */
    public UnlockConnectorRequest(Integer connectorId) {
        this.connectorId = connectorId;
    }

}
