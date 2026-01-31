package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.metervalues.MeterValuesRequest;
import com.cuckooy.ocpp.v20.model.metervalues.MeterValuesResponse;

/**
 * The interface Central system meter values event handler.
 */
public interface CentralSystemMeterValuesEventHandler {

    /**
     * Handle meter values meter values response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the meter values response
     */
    MeterValuesResponse handleMeterValues(String sessionId, String identity, MeterValuesRequest request);
}

