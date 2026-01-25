package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.displaymessage.NotifyDisplayMessagesRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.NotifyDisplayMessagesResponse;

public interface CentralSystemDisplayEventHandler {

    NotifyDisplayMessagesResponse handleNotifyDisplayMessages(String sessionId, String identity,
                                                              NotifyDisplayMessagesRequest request);

}

