package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.v20.handler.ChargePointReservationEventHandler;
import com.cuckooy.ocpp.v20.model.reservation.CancelReservationRequest;
import com.cuckooy.ocpp.v20.model.reservation.CancelReservationResponse;
import com.cuckooy.ocpp.v20.model.reservation.ReserveNowRequest;
import com.cuckooy.ocpp.v20.model.reservation.ReserveNowResponse;
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

public class ChargePointReservationEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointReservationEventHandler {

    public ChargePointReservationEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                  SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public CancelReservationResponse handleCancelReservation(String sessionId, String identity,
                                                             CancelReservationRequest request) {
        return (CancelReservationResponse) invoke(sessionId, identity, request);
    }

    @Override
    public ReserveNowResponse handleReserveNow(String sessionId, String identity, ReserveNowRequest request) {
        return (ReserveNowResponse) invoke(sessionId, identity, request);
    }
}
