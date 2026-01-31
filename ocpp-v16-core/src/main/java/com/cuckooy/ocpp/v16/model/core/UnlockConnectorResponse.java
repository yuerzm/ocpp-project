package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Unlock connector response.
 */
@Data
@NoArgsConstructor
public class UnlockConnectorResponse implements Response {

    private UnlockStatus status;

    /**
     * Instantiates a new Unlock connector response.
     *
     * @param status the status
     */
    public UnlockConnectorResponse(UnlockStatus status) {
        this.status = status;
    }

}
