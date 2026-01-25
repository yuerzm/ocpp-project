package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.authorization.ClearCacheRequest;
import com.cuckooy.ocpp.v20.model.authorization.ClearCacheResponse;

public interface ChargePointAuthorizationEventHandler {

    ClearCacheResponse handleClearCache(String sessionId, String identity, ClearCacheRequest request);
}

