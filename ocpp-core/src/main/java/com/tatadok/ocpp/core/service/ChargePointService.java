package com.tatadok.ocpp.core.service;

import com.tatadok.ocpp.core.message.OcppVersion;
import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.core.message.Response;

public interface ChargePointService {

    Response handle(String sessionId, String identity, Request request);

    OcppVersion getVersion();
}