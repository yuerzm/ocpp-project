package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointTariffAndCostEventHandler;
import com.cuckooy.ocpp.v20.model.cost.CostUpdatedRequest;
import com.cuckooy.ocpp.v20.model.cost.CostUpdatedResponse;

public class ChargePointTariffAndCostEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointTariffAndCostEventHandler {
    public ChargePointTariffAndCostEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public CostUpdatedResponse handleCostUpdated(String identity, CostUpdatedRequest request) { return (CostUpdatedResponse) invoke(identity, request); }
}
