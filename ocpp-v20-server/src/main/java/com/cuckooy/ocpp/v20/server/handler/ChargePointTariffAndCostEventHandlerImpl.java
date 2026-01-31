package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.v20.handler.ChargePointTariffAndCostEventHandler;
import com.cuckooy.ocpp.v20.model.cost.CostUpdatedRequest;
import com.cuckooy.ocpp.v20.model.cost.CostUpdatedResponse;
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

public class ChargePointTariffAndCostEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointTariffAndCostEventHandler {

    public ChargePointTariffAndCostEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                    SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public CostUpdatedResponse handleCostUpdated(String sessionId, String identity, CostUpdatedRequest request) {
        return (CostUpdatedResponse) invoke(sessionId, identity, request);
    }
}
