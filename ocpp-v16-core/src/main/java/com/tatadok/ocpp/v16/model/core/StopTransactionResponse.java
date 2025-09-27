package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Response;
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
