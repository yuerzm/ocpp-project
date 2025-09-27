package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RemoteStartTransactionResponse implements Response {

    private RemoteStartStopStatus status;

    public RemoteStartTransactionResponse(RemoteStartStopStatus status) {
        this.status = status;
    }

}
