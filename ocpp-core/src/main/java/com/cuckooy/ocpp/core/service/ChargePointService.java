package com.cuckooy.ocpp.core.service;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;

public interface ChargePointService {

    Response handle(String sessionId, String identity, Request request);

    OcppVersion getVersion();
}