package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointAvailabilityEventHandler;
import com.cuckooy.ocpp.v20.model.availability.*;

public class ChargePointAvailabilityEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointAvailabilityEventHandler {
    public ChargePointAvailabilityEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public ChangeAvailabilityResponse handleChangeAvailability(String identity, ChangeAvailabilityRequest request) { return (ChangeAvailabilityResponse) invoke(identity, request); }
}
