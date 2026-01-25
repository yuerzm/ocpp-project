package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.metervalues.MeterValuesRequest;
import com.cuckooy.ocpp.v20.model.metervalues.MeterValuesResponse;

public interface CentralSystemMeterValuesEventHandler {

    MeterValuesResponse handleMeterValues(String sessionId, String identity, MeterValuesRequest request);
}

