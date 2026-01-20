package com.tatadok.ocpp.v16.operation;

import com.tatadok.ocpp.core.message.OcppVersion;
import com.tatadok.ocpp.core.service.CentralSystemService;

public interface Ocpp16CentralSystemService extends CentralSystemService {

    default OcppVersion getVersion() {
        return OcppVersion.V_16;
    }
}
