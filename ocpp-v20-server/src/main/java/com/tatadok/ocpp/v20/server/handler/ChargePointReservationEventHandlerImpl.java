package com.tatadok.ocpp.v20.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointReservationEventHandler;
import com.tatadok.ocpp.v20.model.reservation.CancelReservationRequest;
import com.tatadok.ocpp.v20.model.reservation.CancelReservationResponse;
import com.tatadok.ocpp.v20.model.reservation.ReserveNowRequest;
import com.tatadok.ocpp.v20.model.reservation.ReserveNowResponse;
import com.tatadok.ocpp.v20.server.Ocpp20ServerTransport;

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
