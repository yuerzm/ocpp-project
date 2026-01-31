package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.displaymessage.ClearDisplayMessageRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.ClearDisplayMessageResponse;
import com.cuckooy.ocpp.v20.model.displaymessage.GetDisplayMessagesRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.GetDisplayMessagesResponse;
import com.cuckooy.ocpp.v20.model.displaymessage.SetDisplayMessageRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.SetDisplayMessageResponse;

/**
 * The interface Charge point display message event handler.
 */
public interface ChargePointDisplayMessageEventHandler {

    /**
     * Handle set display message set display message response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the set display message response
     */
    SetDisplayMessageResponse handleSetDisplayMessage(String sessionId, String identity,
                                                      SetDisplayMessageRequest request);

    /**
     * Handle get display messages get display messages response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the get display messages response
     */
    GetDisplayMessagesResponse handleGetDisplayMessages(String sessionId, String identity,
                                                        GetDisplayMessagesRequest request);

    /**
     * Handle clear display message clear display message response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the clear display message response
     */
    ClearDisplayMessageResponse handleClearDisplayMessage(String sessionId, String identity,
                                                          ClearDisplayMessageRequest request);
}

