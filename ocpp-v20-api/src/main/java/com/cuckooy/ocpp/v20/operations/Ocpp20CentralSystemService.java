package com.cuckooy.ocpp.v20.operations;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.core.service.CentralSystemService;

public interface Ocpp20CentralSystemService extends CentralSystemService {

    default OcppVersion getVersion() {
        return OcppVersion.V_201;
    }
}
