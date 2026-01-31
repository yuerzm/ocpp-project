package com.cuckooy.ocpp.v16.handler;

import com.cuckooy.ocpp.v16.model.remotetrigger.TriggerMessageRequest;
import com.cuckooy.ocpp.v16.model.remotetrigger.TriggerMessageResponse;

/**
 * The interface Charge point remote trigger event handler.
 */
public interface ChargePointRemoteTriggerEventHandler {

    /**
     * Handle trigger message trigger message response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the trigger message response
     */
    TriggerMessageResponse handleTriggerMessage(String sessionId, String identity, TriggerMessageRequest request);
}
