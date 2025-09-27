package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.displaymessage.ClearDisplayMessageRequest;
import com.tatadok.ocpp.v20.model.displaymessage.ClearDisplayMessageResponse;
import com.tatadok.ocpp.v20.model.displaymessage.GetDisplayMessagesRequest;
import com.tatadok.ocpp.v20.model.displaymessage.GetDisplayMessagesResponse;
import com.tatadok.ocpp.v20.model.displaymessage.SetDisplayMessageRequest;
import com.tatadok.ocpp.v20.model.displaymessage.SetDisplayMessageResponse;

public interface ChargePointDisplayMessageEventHandler {

    SetDisplayMessageResponse handleSetDisplayMessage(String sessionId, String identity,
                                                      SetDisplayMessageRequest request);

    GetDisplayMessagesResponse handleGetDisplayMessages(String sessionId, String identity,
                                                        GetDisplayMessagesRequest request);

    ClearDisplayMessageResponse handleClearDisplayMessage(String sessionId, String identity,
                                                          ClearDisplayMessageRequest request);
}

