package com.cuckooy.ocpp.v16.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointSmartChargingEventHandler;
import com.cuckooy.ocpp.v16.model.smartcharging.*;

public class ChargePointSmartChargingEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointSmartChargingEventHandler {

    public ChargePointSmartChargingEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public SetChargingProfileResponse handleSetChargingProfile(String identity, SetChargingProfileRequest request) {
        return (SetChargingProfileResponse) invoke(identity, request);
    }

    @Override
    public ClearChargingProfileResponse handleClearChargingProfile(String identity, ClearChargingProfileRequest request) {
        return (ClearChargingProfileResponse) invoke(identity, request);
    }

    @Override
    public GetCompositeScheduleResponse handleGetCompositeSchedule(String identity, GetCompositeScheduleRequest request) {
        return (GetCompositeScheduleResponse) invoke(identity, request);
    }
}
