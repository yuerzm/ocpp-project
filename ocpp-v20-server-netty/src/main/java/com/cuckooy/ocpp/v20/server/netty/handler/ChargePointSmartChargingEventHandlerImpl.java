package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointSmartChargingEventHandler;
import com.cuckooy.ocpp.v20.model.smartcharging.*;

public class ChargePointSmartChargingEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointSmartChargingEventHandler {
    public ChargePointSmartChargingEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public ClearChargingProfileResponse handleClearChargingProfile(String identity, ClearChargingProfileRequest request) { return (ClearChargingProfileResponse) invoke(identity, request); }
    @Override public GetChargingProfilesResponse handleGetChargingProfiles(String identity, GetChargingProfilesRequest request) { return (GetChargingProfilesResponse) invoke(identity, request); }
    @Override public GetCompositeScheduleResponse handleGetCompositeSchedule(String identity, GetCompositeScheduleRequest request) { return (GetCompositeScheduleResponse) invoke(identity, request); }
    @Override public SetChargingProfileResponse handleSetChargingProfile(String identity, SetChargingProfileRequest request) { return (SetChargingProfileResponse) invoke(identity, request); }
}
