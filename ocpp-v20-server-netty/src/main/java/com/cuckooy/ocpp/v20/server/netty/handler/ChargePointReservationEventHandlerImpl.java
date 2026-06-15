package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointReservationEventHandler;
import com.cuckooy.ocpp.v20.model.reservation.*;

public class ChargePointReservationEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointReservationEventHandler {
    public ChargePointReservationEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public CancelReservationResponse handleCancelReservation(String identity, CancelReservationRequest request) { return (CancelReservationResponse) invoke(identity, request); }
    @Override public ReserveNowResponse handleReserveNow(String identity, ReserveNowRequest request) { return (ReserveNowResponse) invoke(identity, request); }
}
