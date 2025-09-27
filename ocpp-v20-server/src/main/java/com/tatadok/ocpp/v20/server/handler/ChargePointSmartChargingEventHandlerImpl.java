package com.tatadok.ocpp.v20.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointSmartChargingEventHandler;
import com.tatadok.ocpp.v20.model.smartcharging.ClearChargingProfileRequest;
import com.tatadok.ocpp.v20.model.smartcharging.ClearChargingProfileResponse;
import com.tatadok.ocpp.v20.model.smartcharging.GetChargingProfilesRequest;
import com.tatadok.ocpp.v20.model.smartcharging.GetChargingProfilesResponse;
import com.tatadok.ocpp.v20.model.smartcharging.GetCompositeScheduleRequest;
import com.tatadok.ocpp.v20.model.smartcharging.GetCompositeScheduleResponse;
import com.tatadok.ocpp.v20.model.smartcharging.SetChargingProfileRequest;
import com.tatadok.ocpp.v20.model.smartcharging.SetChargingProfileResponse;
import com.tatadok.ocpp.v20.server.Ocpp20ServerTransport;

public class ChargePointSmartChargingEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointSmartChargingEventHandler {

    public ChargePointSmartChargingEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                    SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public ClearChargingProfileResponse handleClearChargingProfile(String sessionId, String identity,
                                                                   ClearChargingProfileRequest request) {
        return (ClearChargingProfileResponse) invoke(sessionId, identity, request);
    }

    @Override
    public GetChargingProfilesResponse handleGetChargingProfiles(String sessionId, String identity,
                                                                 GetChargingProfilesRequest request) {
        return (GetChargingProfilesResponse) invoke(sessionId, identity, request);
    }

    @Override
    public GetCompositeScheduleResponse handleGetCompositeSchedule(String sessionId, String identity,
                                                                   GetCompositeScheduleRequest request) {
        return (GetCompositeScheduleResponse) invoke(sessionId, identity, request);
    }

    @Override
    public SetChargingProfileResponse handleSetChargingProfile(String sessionId, String identity,
                                                               SetChargingProfileRequest request) {
        return (SetChargingProfileResponse) invoke(sessionId, identity, request);
    }
}
