package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointTariffAndCostEventHandler;
import com.cuckooy.ocpp.v20.model.cost.CostUpdatedRequest;
import com.cuckooy.ocpp.v20.model.cost.CostUpdatedResponse;
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

/**
 * The type Charge point tariff and cost event handler.
 */
public class ChargePointTariffAndCostEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointTariffAndCostEventHandler {

    /**
     * Instantiates a new Charge point tariff and cost event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public ChargePointTariffAndCostEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                    SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public CostUpdatedResponse handleCostUpdated(String identity, CostUpdatedRequest request) {
        return (CostUpdatedResponse) invoke(identity, request);
    }
}
