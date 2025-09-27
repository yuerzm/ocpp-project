package com.tatadok.ocpp.server.provision;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.core.message.Response;

public interface CentralSystemSimulator {

    Response handle(String sessionId, String identity, Request request);
}
