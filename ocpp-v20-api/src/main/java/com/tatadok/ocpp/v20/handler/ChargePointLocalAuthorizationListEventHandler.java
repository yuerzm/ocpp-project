package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.localauth.GetLocalListVersionRequest;
import com.tatadok.ocpp.v20.model.localauth.GetLocalListVersionResponse;
import com.tatadok.ocpp.v20.model.localauth.SendLocalListRequest;
import com.tatadok.ocpp.v20.model.localauth.SendLocalListResponse;

public interface ChargePointLocalAuthorizationListEventHandler {

    SendLocalListResponse handleSendLocalList(String sessionId, String identity, SendLocalListRequest request);

    GetLocalListVersionResponse handleGetLocalListVersion(String sessionId, String identity,
                                                          GetLocalListVersionRequest request);
}

