package com.cuckooy.ocpp.v16.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointFirmwareManagementEventHandler;
import com.cuckooy.ocpp.v16.model.firmware.GetDiagnosticsRequest;
import com.cuckooy.ocpp.v16.model.firmware.GetDiagnosticsResponse;
import com.cuckooy.ocpp.v16.model.firmware.UpdateFirmwareRequest;
import com.cuckooy.ocpp.v16.model.firmware.UpdateFirmwareResponse;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Charge point firmware management event handler.
 */
public class ChargePointFirmwareManagementEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointFirmwareManagementEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Instantiates a new Charge point firmware management event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
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
