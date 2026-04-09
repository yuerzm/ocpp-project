package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.authorization.ClearCacheRequest;
import com.cuckooy.ocpp.v20.model.authorization.ClearCacheResponse;

/**
 * The interface Charge point authorization event handler.
 */
public interface ChargePointAuthorizationEventHandler {

    /**
     * Handle clear cache clear cache response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the clear cache response
     */
    ClearCacheResponse handleClearCache(String identity, ClearCacheRequest request);
}

