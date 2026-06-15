package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointFirmwareManagementEventHandler;
import com.cuckooy.ocpp.v20.model.firmware.*;

public class ChargePointFirmwareManagementManagementEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointFirmwareManagementEventHandler {
    public ChargePointFirmwareManagementManagementEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public PublishFirmwareResponse handlePublishFirmware(String identity, PublishFirmwareRequest request) { return (PublishFirmwareResponse) invoke(identity, request); }
    @Override public UpdateFirmwareResponse handleUpdateFirmware(String identity, UpdateFirmwareRequest request) { return (UpdateFirmwareResponse) invoke(identity, request); }
    @Override public UnpublishFirmwareResponse handleUnpublishFirmware(String identity, UnpublishFirmwareRequest request) { return (UnpublishFirmwareResponse) invoke(identity, request); }
}
