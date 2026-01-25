package com.cuckooy.ocpp.v20.operations;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.core.service.ChargePointService;

public interface Ocpp20ChargePointService extends ChargePointService {

    default OcppVersion getVersion() {
        return OcppVersion.V_201;
    }
}
