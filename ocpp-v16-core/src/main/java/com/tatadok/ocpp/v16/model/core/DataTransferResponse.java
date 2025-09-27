package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DataTransferResponse implements Response {

    private DataTransferStatus status;

    private Object data;

    public DataTransferResponse(DataTransferStatus status, Object data) {
        this.status = status;
        this.data = data;
    }

}
