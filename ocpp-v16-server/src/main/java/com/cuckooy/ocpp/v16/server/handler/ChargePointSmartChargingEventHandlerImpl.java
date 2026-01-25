package com.cuckooy.ocpp.v16.server.handler;

import com.cuckooy.ocpp.server.SessionRepository;
import com.cuckooy.ocpp.server.provision.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointSmartChargingEventHandler;
import com.cuckooy.ocpp.v16.model.smartcharging.ClearChargingProfileRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.ClearChargingProfileResponse;
import com.cuckooy.ocpp.v16.model.smartcharging.GetCompositeScheduleRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.GetCompositeScheduleResponse;
import com.cuckooy.ocpp.v16.model.smartcharging.SetChargingProfileRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.SetChargingProfileResponse;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChargePointSmartChargingEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointSmartChargingEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public ChargePointSmartChargingEventHandlerImpl(Ocpp16ServerTransport serverTransport,
                                                    SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public SetChargingProfileResponse handleSetChargingProfile(String sessionId, String identity,
                                                               SetChargingProfileRequest request) {
        return (SetChargingProfileResponse) invoke(sessionId, identity, request);
    }

    @Override
    public ClearChargingProfileResponse handleClearChargingProfile(String sessionId, String identity,
                                                                   ClearChargingProfileRequest request) {
        return (ClearChargingProfileResponse) invoke(sessionId, identity, request);
    }

    @Override
    public GetCompositeScheduleResponse handleGetCompositeSchedule(String sessionId, String identity,
                                                                   GetCompositeScheduleRequest request) {
        return (GetCompositeScheduleResponse) invoke(sessionId, identity, request);
    }
}
