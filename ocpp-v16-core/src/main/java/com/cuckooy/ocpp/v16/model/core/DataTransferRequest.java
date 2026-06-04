package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Data transfer request.
 */
@Data
@NoArgsConstructor
public class DataTransferRequest implements Request {

    private String vendorId;

    private String messageId;

    private String data;

    /**
     * Instantiates a new Data transfer request.
     *
     * @param vendorId  the vendor id
     * @param messageId the message id
     */
    public DataTransferRequest(String vendorId, String messageId) {
        this.vendorId = vendorId;
        this.messageId = messageId;
        this.data = "";
    }

}
