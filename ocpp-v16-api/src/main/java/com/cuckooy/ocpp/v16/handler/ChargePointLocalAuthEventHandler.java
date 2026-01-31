package com.cuckooy.ocpp.v16.handler;

import com.cuckooy.ocpp.v16.model.localauthlist.GetLocalListVersionRequest;
import com.cuckooy.ocpp.v16.model.localauthlist.GetLocalListVersionResponse;
import com.cuckooy.ocpp.v16.model.localauthlist.SendLocalListRequest;
import com.cuckooy.ocpp.v16.model.localauthlist.SendLocalListResponse;

/**
 * The interface Charge point local auth event handler.
 */
public interface ChargePointLocalAuthEventHandler {

    /**
     * Handle get local list version get local list version response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the get local list version response
     */
    GetLocalListVersionResponse handleGetLocalListVersion(String sessionId, String identity,
                                                          GetLocalListVersionRequest request);

    /**
     * Handle send local list send local list response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the send local list response
     */
    SendLocalListResponse handleSendLocalList(String sessionId, String identity, SendLocalListRequest request);
}
