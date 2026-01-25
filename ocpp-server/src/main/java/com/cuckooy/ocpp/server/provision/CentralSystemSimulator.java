package com.cuckooy.ocpp.server.provision;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;

public interface CentralSystemSimulator {

    Response handle(String sessionId, String identity, Request request);
}
