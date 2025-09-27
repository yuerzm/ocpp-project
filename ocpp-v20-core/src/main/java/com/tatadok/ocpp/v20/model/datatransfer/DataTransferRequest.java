package com.tatadok.ocpp.v20.model.datatransfer;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

@Data
public class DataTransferRequest implements Request {

    private String vendorId;
    private String messageId;
    private Object data;

    public DataTransferRequest(String vendorId, String messageId) {
        this.vendorId = vendorId;
        this.messageId = messageId;
    }

    public DataTransferRequest(String vendorId, String messageId, Object data) {
        this.vendorId = vendorId;
        this.messageId = messageId;
        this.data = data;
    }
}
