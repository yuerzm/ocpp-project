package com.cuckooy.ocpp.v16.operation;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.core.service.CentralSystemService;

/**
 * The interface Ocpp 16 central system service.
 */
public interface Ocpp16CentralSystemService extends CentralSystemService {

    default OcppVersion getVersion() {
        return OcppVersion.V_16;
    }
}
