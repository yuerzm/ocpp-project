package com.tatadok.ocpp.v20.operations;

import com.tatadok.ocpp.core.message.OcppVersion;
import com.tatadok.ocpp.core.service.ChargePointService;

public interface Ocpp20ChargePointService extends ChargePointService {

    default OcppVersion getVersion() {
        return OcppVersion.V_20;
    }
}
