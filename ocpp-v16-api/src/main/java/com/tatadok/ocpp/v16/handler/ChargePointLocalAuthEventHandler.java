package com.tatadok.ocpp.v16.handler;

import com.tatadok.ocpp.v16.model.localauthlist.GetLocalListVersionRequest;
import com.tatadok.ocpp.v16.model.localauthlist.GetLocalListVersionResponse;
import com.tatadok.ocpp.v16.model.localauthlist.SendLocalListRequest;
import com.tatadok.ocpp.v16.model.localauthlist.SendLocalListResponse;

public interface ChargePointLocalAuthEventHandler {

    GetLocalListVersionResponse handleGetLocalListVersion(String sessionId, String identity,
                                                          GetLocalListVersionRequest request);

    SendLocalListResponse handleSendLocalList(String sessionId, String identity, SendLocalListRequest request);
}
