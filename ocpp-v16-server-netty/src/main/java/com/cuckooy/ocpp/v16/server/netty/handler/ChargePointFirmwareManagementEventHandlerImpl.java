package com.cuckooy.ocpp.v16.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointFirmwareManagementEventHandler;
import com.cuckooy.ocpp.v16.model.firmware.*;

public class ChargePointFirmwareManagementEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointFirmwareManagementEventHandler {

    public ChargePointFirmwareManagementEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public UpdateFirmwareResponse handleUpdateFirmware(String identity, UpdateFirmwareRequest request) {
        return (UpdateFirmwareResponse) invoke(identity, request);
    }

    @Override
    public GetDiagnosticsResponse handleGetDiagnostics(String identity, GetDiagnosticsRequest request) {
        return (GetDiagnosticsResponse) invoke(identity, request);
    }
}
