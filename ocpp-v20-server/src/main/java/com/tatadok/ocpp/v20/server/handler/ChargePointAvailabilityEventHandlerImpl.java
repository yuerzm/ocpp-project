package com.tatadok.ocpp.v20.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointAvailabilityEventHandler;
import com.tatadok.ocpp.v20.model.availability.ChangeAvailabilityRequest;
import com.tatadok.ocpp.v20.model.availability.ChangeAvailabilityResponse;
import com.tatadok.ocpp.v20.server.Ocpp20ServerTransport;

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
