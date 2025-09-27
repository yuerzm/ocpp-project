package com.tatadok.ocpp.v16.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v16.handler.ChargePointFirmwareManagementEventHandler;
import com.tatadok.ocpp.v16.model.firmware.GetDiagnosticsRequest;
import com.tatadok.ocpp.v16.model.firmware.GetDiagnosticsResponse;
import com.tatadok.ocpp.v16.model.firmware.UpdateFirmwareRequest;
import com.tatadok.ocpp.v16.model.firmware.UpdateFirmwareResponse;
import com.tatadok.ocpp.v16.server.Ocpp16ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ChargePointFirmwareManagementEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointFirmwareManagementEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public ChargePointFirmwareManagementEventHandlerImpl(Ocpp16ServerTransport serverTransport,
                                                         SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public GetDiagnosticsResponse handleGetDiagnostics(String sessionId, String identity,
                                                       GetDiagnosticsRequest request) {
        return (GetDiagnosticsResponse) invoke(sessionId, identity, request);
    }

    @Override
    public UpdateFirmwareResponse handleUpdateFirmware(String sessionId, String identity,
                                                       UpdateFirmwareRequest request) {
        return (UpdateFirmwareResponse) invoke(sessionId, identity, request);
    }
}
