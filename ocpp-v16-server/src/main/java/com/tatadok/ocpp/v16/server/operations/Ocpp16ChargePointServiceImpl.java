package com.tatadok.ocpp.v16.server.operations;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.v16.handler.ChargePointCoreEventHandler;
import com.tatadok.ocpp.v16.handler.ChargePointFirmwareManagementEventHandler;
import com.tatadok.ocpp.v16.model.core.ChangeAvailabilityRequest;
import com.tatadok.ocpp.v16.model.core.ChangeConfigurationRequest;
import com.tatadok.ocpp.v16.model.core.ClearCacheRequest;
import com.tatadok.ocpp.v16.model.core.DataTransferRequest;
import com.tatadok.ocpp.v16.model.core.GetConfigurationRequest;
import com.tatadok.ocpp.v16.model.core.RemoteStartTransactionRequest;
import com.tatadok.ocpp.v16.model.core.RemoteStopTransactionRequest;
import com.tatadok.ocpp.v16.model.core.ResetRequest;
import com.tatadok.ocpp.v16.model.core.UnlockConnectorRequest;
import com.tatadok.ocpp.v16.model.firmware.GetDiagnosticsRequest;
import com.tatadok.ocpp.v16.model.firmware.UpdateFirmwareRequest;
import com.tatadok.ocpp.v16.operation.Ocpp16ChargePointService;
import com.tatadok.ocpp.v16.server.Ocpp16ServerTransport;
import com.tatadok.ocpp.v16.server.handler.ChargePointCoreEventHandlerImpl;
import com.tatadok.ocpp.v16.server.handler.ChargePointFirmwareManagementEventHandlerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.WebSocketSession;

import java.util.Optional;

public class Ocpp16ChargePointServiceImpl implements Ocpp16ChargePointService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final SessionRepository sessionRepository;
    private final ChargePointCoreEventHandler coreEventHandler;
    private final ChargePointFirmwareManagementEventHandler firmwareManagementEventHandler;

    public Ocpp16ChargePointServiceImpl(Ocpp16ServerTransport serverTransport, SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
        this.coreEventHandler = new ChargePointCoreEventHandlerImpl(serverTransport, sessionRepository);
        this.firmwareManagementEventHandler = new ChargePointFirmwareManagementEventHandlerImpl(serverTransport,
            sessionRepository);
    }

    @Override
    public Response handle(String sessionId, String identity, Request request) {

        Optional<WebSocketSession> optional = sessionRepository.get(sessionId, identity);
        if (optional.isEmpty()) {
            logger.warn("Session not connected, session: {}, identity {}", sessionId, identity);
            throw new UnsupportedOperationException("Session with id " + sessionId + " not connected.");
        }

        if (request instanceof ChangeAvailabilityRequest changeAvailabilityRequest) {
            return coreEventHandler.handleChangeAvailability(sessionId, identity, changeAvailabilityRequest);

        } else if (request instanceof ChangeConfigurationRequest changeConfigurationRequest) {
            return coreEventHandler.handleChangeConfiguration(sessionId, identity, changeConfigurationRequest);

        } else if (request instanceof ClearCacheRequest clearCacheRequest) {
            return coreEventHandler.handleClearCache(sessionId, identity, clearCacheRequest);

        } else if (request instanceof DataTransferRequest dataTransferRequest) {
            return coreEventHandler.handleDataTransfer(sessionId, identity, dataTransferRequest);

        } else if (request instanceof GetConfigurationRequest getConfigurationRequest) {
            return coreEventHandler.handleGetConfiguration(sessionId, identity, getConfigurationRequest);

        } else if (request instanceof RemoteStartTransactionRequest remoteStartTransactionRequest) {
            return coreEventHandler.handleRemoteStartTransaction(sessionId, identity, remoteStartTransactionRequest);

        } else if (request instanceof RemoteStopTransactionRequest remoteStopTransactionRequest) {
            return coreEventHandler.handleRemoteStopTransaction(sessionId, identity, remoteStopTransactionRequest);

        } else if (request instanceof ResetRequest resetRequest) {
            return coreEventHandler.handleReset(sessionId, identity, resetRequest);

        } else if (request instanceof UnlockConnectorRequest unlockConnectorRequest) {
            return coreEventHandler.handleUnlockConnector(sessionId, identity, unlockConnectorRequest);

        } else if (request instanceof GetDiagnosticsRequest getDiagnosticsRequest) {
            return firmwareManagementEventHandler.handleGetDiagnostics(sessionId, identity, getDiagnosticsRequest);

        } else if (request instanceof UpdateFirmwareRequest updateFirmwareRequest) {
            return firmwareManagementEventHandler.handleUpdateFirmware(sessionId, identity, updateFirmwareRequest);

        } else {
            throw new UnsupportedOperationException("Unsupported request type: " + request.getClass());
        }
    }
}
