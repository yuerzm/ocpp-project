package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.displaymessage.NotifyDisplayMessagesRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.NotifyDisplayMessagesResponse;

/**
 * The interface Central system display event handler.
 */
public interface CentralSystemDisplayEventHandler {

    /**
     * Handle notify display messages notify display messages response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the notify display messages response
     */
    NotifyDisplayMessagesResponse handleNotifyDisplayMessages(String identity, NotifyDisplayMessagesRequest request);

}

