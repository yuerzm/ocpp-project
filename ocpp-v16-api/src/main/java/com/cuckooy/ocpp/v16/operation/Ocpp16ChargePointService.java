package com.cuckooy.ocpp.v16.operation;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.core.service.ChargePointService;

/**
 * The interface Ocpp 16 charge point service.
 */
public interface Ocpp16ChargePointService extends ChargePointService {

    default OcppVersion getVersion() {
        return OcppVersion.V_16;
    }
}
