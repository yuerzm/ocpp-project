package com.tatadok.ocpp.v16.handler;

import com.tatadok.ocpp.v16.model.remotetrigger.TriggerMessageRequest;
import com.tatadok.ocpp.v16.model.remotetrigger.TriggerMessageResponse;

public interface ChargePointRemoteTriggerEventHandler {

    TriggerMessageResponse handleTriggerMessage(String sessionId, String identity, TriggerMessageRequest request);
}
