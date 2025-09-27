package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.displaymessage.NotifyDisplayMessagesRequest;
import com.tatadok.ocpp.v20.model.displaymessage.NotifyDisplayMessagesResponse;

public interface CentralSystemDisplayEventHandler {

    NotifyDisplayMessagesResponse handleNotifyDisplayMessages(String sessionId, String identity,
                                                              NotifyDisplayMessagesRequest request);

}

