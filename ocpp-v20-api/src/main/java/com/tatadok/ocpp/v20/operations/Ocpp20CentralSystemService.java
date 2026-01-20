package com.tatadok.ocpp.v20.operations;

import com.tatadok.ocpp.core.message.OcppVersion;
import com.tatadok.ocpp.core.service.CentralSystemService;

public interface Ocpp20CentralSystemService extends CentralSystemService {

    default OcppVersion getVersion() {
        return OcppVersion.V_201;
    }
}
