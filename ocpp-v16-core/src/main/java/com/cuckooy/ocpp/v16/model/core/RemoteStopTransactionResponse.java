package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Remote stop transaction response.
 */
@Data
@NoArgsConstructor
public class RemoteStopTransactionResponse implements Response {

    private RemoteStartStopStatus status;

    /**
     * Instantiates a new Remote stop transaction response.
     *
     * @param status the status
     */
    public RemoteStopTransactionResponse(RemoteStartStopStatus status) {
        this.status = status;
    }

}
