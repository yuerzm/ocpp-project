package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.cost.CostUpdatedRequest;
import com.cuckooy.ocpp.v20.model.cost.CostUpdatedResponse;

public interface ChargePointTariffAndCostEventHandler {

    CostUpdatedResponse handleCostUpdated(String sessionId, String identity, CostUpdatedRequest request);
}
