package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClearCacheResponse implements Response {

    private ClearCacheStatus status;

    public ClearCacheResponse(ClearCacheStatus status) {
        this.status = status;
    }

}
