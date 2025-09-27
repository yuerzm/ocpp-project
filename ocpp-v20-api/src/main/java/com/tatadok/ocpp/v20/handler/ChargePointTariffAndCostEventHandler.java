package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.cost.CostUpdatedRequest;
import com.tatadok.ocpp.v20.model.cost.CostUpdatedResponse;

public interface ChargePointTariffAndCostEventHandler {

    CostUpdatedResponse handleCostUpdated(String sessionId, String identity, CostUpdatedRequest request);
}
