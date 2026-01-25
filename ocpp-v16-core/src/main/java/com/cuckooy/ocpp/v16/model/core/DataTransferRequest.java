package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DataTransferRequest implements Request {

    private String vendorId;

    private String messageId;

    private Object data;

    public DataTransferRequest(String vendorId, String messageId) {
        this.vendorId = vendorId;
        this.messageId = messageId;
        this.data = "";
    }

}
