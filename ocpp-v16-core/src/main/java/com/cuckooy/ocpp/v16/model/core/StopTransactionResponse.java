package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Stop transaction response.
 */
@Data
@NoArgsConstructor
public class StopTransactionResponse implements Response {

    private IdTagInfo idTagInfo;

    /**
     * Instantiates a new Stop transaction response.
     *
     * @param idTagInfo the id tag info
     */
    public StopTransactionResponse(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }

}
