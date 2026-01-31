package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Reset request.
 */
@Data
@NoArgsConstructor
public class ResetRequest implements Request {

    private ResetType type;

    /**
     * Instantiates a new Reset request.
     *
     * @param type the type
     */
    public ResetRequest(ResetType type) {
        this.type = type;
    }

}
