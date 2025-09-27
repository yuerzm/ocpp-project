package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StartTransactionResponse implements Response {

    private IdTagInfo idTagInfo;

    private Integer transactionId;

    public StartTransactionResponse(IdTagInfo idTagInfo, Integer transactionId) {
        this.idTagInfo = idTagInfo;
        this.transactionId = transactionId;
    }

}
