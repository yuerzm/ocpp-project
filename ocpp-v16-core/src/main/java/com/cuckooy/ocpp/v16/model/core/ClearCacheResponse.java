package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Clear cache response.
 */
@Data
@NoArgsConstructor
public class ClearCacheResponse implements Response {

    private ClearCacheStatus status;

    /**
     * Instantiates a new Clear cache response.
     *
     * @param status the status
     */
    public ClearCacheResponse(ClearCacheStatus status) {
        this.status = status;
    }

}
