package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Data transfer response.
 */
@Data
@NoArgsConstructor
public class DataTransferResponse implements Response {

    private DataTransferStatus status;

    private Object data;

    /**
     * Instantiates a new Data transfer response.
     *
     * @param status the status
     * @param data   the data
     */
    public DataTransferResponse(DataTransferStatus status, Object data) {
        this.status = status;
        this.data = data;
    }

}
