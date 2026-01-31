package com.cuckooy.ocpp.v16.server.operations;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointCoreEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointFirmwareManagementEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointLocalAuthEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointRemoteTriggerEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointReservationEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointSmartChargingEventHandler;
import com.cuckooy.ocpp.v16.model.core.ChangeAvailabilityRequest;
import com.cuckooy.ocpp.v16.model.core.ChangeConfigurationRequest;
import com.cuckooy.ocpp.v16.model.core.ClearCacheRequest;
import com.cuckooy.ocpp.v16.model.core.DataTransferRequest;
import com.cuckooy.ocpp.v16.model.core.GetConfigurationRequest;
import com.cuckooy.ocpp.v16.model.core.RemoteStartTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.RemoteStopTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.ResetRequest;
import com.cuckooy.ocpp.v16.model.core.UnlockConnectorRequest;
import com.cuckooy.ocpp.v16.model.firmware.GetDiagnosticsRequest;
import com.cuckooy.ocpp.v16.model.firmware.UpdateFirmwareRequest;
import com.cuckooy.ocpp.v16.model.localauthlist.GetLocalListVersionRequest;
import com.cuckooy.ocpp.v16.model.localauthlist.SendLocalListRequest;
import com.cuckooy.ocpp.v16.model.remotetrigger.TriggerMessageRequest;
import com.cuckooy.ocpp.v16.model.reservation.CancelReservationRequest;
import com.cuckooy.ocpp.v16.model.reservation.ReserveNowRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.ClearChargingProfileRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.GetCompositeScheduleRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.SetChargingProfileRequest;
import com.cuckooy.ocpp.v16.operation.Ocpp16ChargePointService;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;
import com.cuckooy.ocpp.v16.server.handler.ChargePointCoreEventHandlerImpl;
import com.cuckooy.ocpp.v16.server.handler.ChargePointFirmwareManagementEventHandlerImpl;
import com.cuckooy.ocpp.v16.server.handler.ChargePointLocalAuthEventHandlerImpl;
import com.cuckooy.ocpp.v16.server.handler.ChargePointRemoteTriggerEventHandlerImpl;
import com.cuckooy.ocpp.v16.server.handler.ChargePointReservationEventHandlerImpl;
import com.cuckooy.ocpp.v16.server.handler.ChargePointSmartChargingEventHandlerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.WebSocketSession;

import java.util.Optional;

public class Ocpp16ChargePointServiceImpl implements Ocpp16ChargePointService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final SessionRepository sessionRepository;
    private final ChargePointCoreEventHandler coreEventHandler;
    private final ChargePointFirmwareManagementEventHandler firmwareManagementEventHandler;
    private final ChargePointLocalAuthEventHandler localAuthEventHandler;
    private final ChargePointRemoteTriggerEventHandler remoteTriggerEventHandler;
    private final ChargePointReservationEventHandler reservationEventHandler;
    private final ChargePointSmartChargingEventHandler smartChargingEventHandler;

    public Ocpp16ChargePointServiceImpl(Ocpp16ServerTransport serverTransport, SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
        this.coreEventHandler = new ChargePointCoreEventHandlerImpl(serverTransport, sessionRepository);
        this.firmwareManagementEventHandler = new ChargePointFirmwareManagementEventHandlerImpl(serverTransport,
            sessionRepository);
        this.localAuthEventHandler = new ChargePointLocalAuthEventHandlerImpl(serverTransport, sessionRepository);
        this.remoteTriggerEventHandler = new ChargePointRemoteTriggerEventHandlerImpl(serverTransport,
            sessionRepository);
        this.reservationEventHandler = new ChargePointReservationEventHandlerImpl(serverTransport, sessionRepository);
        this.smartChargingEventHandler = new ChargePointSmartChargingEventHandlerImpl(serverTransport,
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

        } else if (request instanceof GetLocalListVersionRequest getLocalListVersionRequest) {
            return localAuthEventHandler.handleGetLocalListVersion(sessionId, identity, getLocalListVersionRequest);

        } else if (request instanceof SendLocalListRequest sendLocalListRequest) {
            return localAuthEventHandler.handleSendLocalList(sessionId, identity, sendLocalListRequest);

        } else if (request instanceof TriggerMessageRequest triggerMessageRequest) {
            return remoteTriggerEventHandler.handleTriggerMessage(sessionId, identity, triggerMessageRequest);

        } else if (request instanceof ReserveNowRequest reserveNowRequest) {
            return reservationEventHandler.handleReserveNow(sessionId, identity, reserveNowRequest);

        } else if (request instanceof CancelReservationRequest cancelReservationRequest) {
            return reservationEventHandler.handleCancelReservation(sessionId, identity, cancelReservationRequest);

        } else if (request instanceof SetChargingProfileRequest setChargingProfileRequest) {
            return smartChargingEventHandler.handleSetChargingProfile(sessionId, identity, setChargingProfileRequest);

        } else if (request instanceof ClearChargingProfileRequest clearChargingProfileRequest) {
            return smartChargingEventHandler.handleClearChargingProfile(sessionId, identity,
                clearChargingProfileRequest);

        } else if (request instanceof GetCompositeScheduleRequest getCompositeScheduleRequest) {
            return smartChargingEventHandler.handleGetCompositeSchedule(sessionId, identity,
                getCompositeScheduleRequest);

        } else {
            throw new UnsupportedOperationException("Unsupported request type: " + request.getClass());
        }
    }
}
