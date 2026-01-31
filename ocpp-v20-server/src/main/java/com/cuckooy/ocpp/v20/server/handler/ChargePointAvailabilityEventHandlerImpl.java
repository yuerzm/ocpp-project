package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.v20.handler.ChargePointAvailabilityEventHandler;
import com.cuckooy.ocpp.v20.model.availability.ChangeAvailabilityRequest;
import com.cuckooy.ocpp.v20.model.availability.ChangeAvailabilityResponse;
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

public class ChargePointAvailabilityEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointAvailabilityEventHandler {

    public ChargePointAvailabilityEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                   SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public ChangeAvailabilityResponse handleChangeAvailability(String sessionId, String identity,
                                                               ChangeAvailabilityRequest request) {
        return (ChangeAvailabilityResponse) invoke(sessionId, identity, request);
    }
}
