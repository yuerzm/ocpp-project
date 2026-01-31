package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.cost.CostUpdatedRequest;
import com.cuckooy.ocpp.v20.model.cost.CostUpdatedResponse;

/**
 * The interface Charge point tariff and cost event handler.
 */
public interface ChargePointTariffAndCostEventHandler {

    /**
     * Handle cost updated cost updated response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the cost updated response
     */
    CostUpdatedResponse handleCostUpdated(String sessionId, String identity, CostUpdatedRequest request);
}
