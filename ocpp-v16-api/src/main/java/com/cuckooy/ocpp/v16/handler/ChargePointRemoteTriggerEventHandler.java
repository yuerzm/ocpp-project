package com.cuckooy.ocpp.v16.handler;

import com.cuckooy.ocpp.v16.model.remotetrigger.TriggerMessageRequest;
import com.cuckooy.ocpp.v16.model.remotetrigger.TriggerMessageResponse;

public interface ChargePointRemoteTriggerEventHandler {

    TriggerMessageResponse handleTriggerMessage(String sessionId, String identity, TriggerMessageRequest request);
}
