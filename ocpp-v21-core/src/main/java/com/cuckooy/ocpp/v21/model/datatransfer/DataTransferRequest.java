package com.cuckooy.ocpp.v21.model.datatransfer;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

/**
 * The type Data transfer request.
 */
@Data
public class DataTransferRequest implements Request {

    private String vendorId;
    private String messageId;
    private Object data;

    /**
     * Instantiates a new Data transfer request.
     *
     * @param vendorId  the vendor id
     * @param messageId the message id
     */
    public DataTransferRequest(String vendorId, String messageId) {
        this.vendorId = vendorId;
        this.messageId = messageId;
    }

    /**
     * Instantiates a new Data transfer request.
     *
     * @param vendorId  the vendor id
     * @param messageId the message id
     * @param data      the data
     */
    public DataTransferRequest(String vendorId, String messageId, Object data) {
        this.vendorId = vendorId;
        this.messageId = messageId;
        this.data = data;
    }
}
