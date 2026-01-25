package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StopTransactionResponse implements Response {

    private IdTagInfo idTagInfo;

    public StopTransactionResponse(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }

}
