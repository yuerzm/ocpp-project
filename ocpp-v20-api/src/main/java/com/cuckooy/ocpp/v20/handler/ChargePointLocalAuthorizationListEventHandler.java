package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.localauth.GetLocalListVersionRequest;
import com.cuckooy.ocpp.v20.model.localauth.GetLocalListVersionResponse;
import com.cuckooy.ocpp.v20.model.localauth.SendLocalListRequest;
import com.cuckooy.ocpp.v20.model.localauth.SendLocalListResponse;

/**
 * The interface Charge point local authorization list event handler.
 */
public interface ChargePointLocalAuthorizationListEventHandler {

    /**
     * Handle send local list send local list response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the send local list response
     */
    SendLocalListResponse handleSendLocalList(String identity, SendLocalListRequest request);

    /**
     * Handle get local list version get local list version response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the get local list version response
     */
    GetLocalListVersionResponse handleGetLocalListVersion(String identity, GetLocalListVersionRequest request);
}

