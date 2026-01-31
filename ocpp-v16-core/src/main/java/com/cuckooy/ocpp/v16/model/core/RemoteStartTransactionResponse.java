package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Remote start transaction response.
 */
@Data
@NoArgsConstructor
public class RemoteStartTransactionResponse implements Response {

    private RemoteStartStopStatus status;

    /**
     * Instantiates a new Remote start transaction response.
     *
     * @param status the status
     */
    public RemoteStartTransactionResponse(RemoteStartStopStatus status) {
        this.status = status;
    }

}
