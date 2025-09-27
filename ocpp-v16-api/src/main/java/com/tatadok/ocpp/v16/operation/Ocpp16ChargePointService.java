package com.tatadok.ocpp.v16.operation;

import com.tatadok.ocpp.core.message.OcppVersion;
import com.tatadok.ocpp.core.service.ChargePointService;

public interface Ocpp16ChargePointService extends ChargePointService {

    default OcppVersion getVersion() {
        return OcppVersion.V_16;
    }
}
