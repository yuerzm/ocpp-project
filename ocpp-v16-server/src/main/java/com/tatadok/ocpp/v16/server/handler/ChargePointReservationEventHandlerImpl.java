package com.tatadok.ocpp.v16.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v16.handler.ChargePointReservationEventHandler;
import com.tatadok.ocpp.v16.model.reservation.CancelReservationRequest;
import com.tatadok.ocpp.v16.model.reservation.CancelReservationResponse;
import com.tatadok.ocpp.v16.model.reservation.ReserveNowRequest;
import com.tatadok.ocpp.v16.model.reservation.ReserveNowResponse;
import com.tatadok.ocpp.v16.server.Ocpp16ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChargePointReservationEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointReservationEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public ChargePointReservationEventHandlerImpl(Ocpp16ServerTransport serverTransport,
                                                  SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }


    @Override
    public ReserveNowResponse handleReserveNow(String sessionId, String identity, ReserveNowRequest request) {
        return (ReserveNowResponse) invoke(sessionId, identity, request);
    }

    @Override
    public CancelReservationResponse handleCancelReservation(String sessionId, String identity,
                                                             CancelReservationRequest request) {
        return (CancelReservationResponse) invoke(sessionId, identity, request);
    }
}
