package com.tatadok.ocpp.v20.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointFirmwareManagementEventHandler;
import com.tatadok.ocpp.v20.model.firmware.PublishFirmwareRequest;
import com.tatadok.ocpp.v20.model.firmware.PublishFirmwareResponse;
import com.tatadok.ocpp.v20.model.firmware.UnpublishFirmwareRequest;
import com.tatadok.ocpp.v20.model.firmware.UnpublishFirmwareResponse;
import com.tatadok.ocpp.v20.model.firmware.UpdateFirmwareRequest;
import com.tatadok.ocpp.v20.model.firmware.UpdateFirmwareResponse;
import com.tatadok.ocpp.v20.server.Ocpp20ServerTransport;

public class ChargePointFirmwareManagementManagementEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointFirmwareManagementEventHandler {

    public ChargePointFirmwareManagementManagementEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                                   SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public PublishFirmwareResponse handlePublishFirmware(String sessionId, String identity,
                                                         PublishFirmwareRequest request) {
        return (PublishFirmwareResponse) invoke(sessionId, identity, request);
    }

    @Override
    public UpdateFirmwareResponse handleUpdateFirmware(String sessionId, String identity,
                                                       UpdateFirmwareRequest request) {
        return (UpdateFirmwareResponse) invoke(sessionId, identity, request);
    }

    @Override
    public UnpublishFirmwareResponse handleUnpublishFirmware(String sessionId, String identity,
                                                             UnpublishFirmwareRequest request) {
        return (UnpublishFirmwareResponse) invoke(sessionId, identity, request);
    }
}
