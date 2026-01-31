package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Change availability request.
 */
@Data
@NoArgsConstructor
public class ChangeAvailabilityRequest implements Request {

    private Integer connectorId;

    private AvailabilityType type;

    /**
     * Instantiates a new Change availability request.
     *
     * @param connectorId the connector id
     * @param type        the type
     */
    public ChangeAvailabilityRequest(Integer connectorId, AvailabilityType type) {
        this.connectorId = connectorId;
        this.type = type;
    }

}
