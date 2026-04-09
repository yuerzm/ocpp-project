package com.cuckooy.ocpp.v16.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointReservationEventHandler;
import com.cuckooy.ocpp.v16.model.reservation.CancelReservationRequest;
import com.cuckooy.ocpp.v16.model.reservation.CancelReservationResponse;
import com.cuckooy.ocpp.v16.model.reservation.ReserveNowRequest;
import com.cuckooy.ocpp.v16.model.reservation.ReserveNowResponse;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Charge point reservation event handler.
 */
public class ChargePointReservationEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointReservationEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Instantiates a new Charge point reservation event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public ChargePointReservationEventHandlerImpl(Ocpp16ServerTransport serverTransport,
                                                  SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }


    @Override
    public ReserveNowResponse handleReserveNow(String identity, ReserveNowRequest request) {
        return (ReserveNowResponse) invoke(identity, request);
    }

    @Override
    public CancelReservationResponse handleCancelReservation(String identity, CancelReservationRequest request) {
        return (CancelReservationResponse) invoke(identity, request);
    }
}
