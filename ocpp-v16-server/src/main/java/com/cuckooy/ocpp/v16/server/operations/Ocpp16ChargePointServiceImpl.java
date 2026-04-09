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

/**
 * The type Ocpp 16 charge point service.
 */
public class Ocpp16ChargePointServiceImpl implements Ocpp16ChargePointService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final SessionRepository sessionRepository;
    private final ChargePointCoreEventHandler coreEventHandler;
    private final ChargePointFirmwareManagementEventHandler firmwareManagementEventHandler;
    private final ChargePointLocalAuthEventHandler localAuthEventHandler;
    private final ChargePointRemoteTriggerEventHandler remoteTriggerEventHandler;
    private final ChargePointReservationEventHandler reservationEventHandler;
    private final ChargePointSmartChargingEventHandler smartChargingEventHandler;

    /**
     * Instantiates a new Ocpp 16 charge point service.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
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
    public Response handle(String identity, Request request) {

        Optional<WebSocketSession> optional = sessionRepository.get(identity);
        if (optional.isEmpty()) {
            logger.warn("Charge Point not connected, identity {}", identity);
            throw new UnsupportedOperationException("Charge Point with identity " + identity + " not connected.");
        }

        if (request instanceof ChangeAvailabilityRequest changeAvailabilityRequest) {
            return coreEventHandler.handleChangeAvailability(identity, changeAvailabilityRequest);

        } else if (request instanceof ChangeConfigurationRequest changeConfigurationRequest) {
            return coreEventHandler.handleChangeConfiguration(identity, changeConfigurationRequest);

        } else if (request instanceof ClearCacheRequest clearCacheRequest) {
            return coreEventHandler.handleClearCache(identity, clearCacheRequest);

        } else if (request instanceof DataTransferRequest dataTransferRequest) {
            return coreEventHandler.handleDataTransfer(identity, dataTransferRequest);

        } else if (request instanceof GetConfigurationRequest getConfigurationRequest) {
            return coreEventHandler.handleGetConfiguration(identity, getConfigurationRequest);

        } else if (request instanceof RemoteStartTransactionRequest remoteStartTransactionRequest) {
            return coreEventHandler.handleRemoteStartTransaction(identity, remoteStartTransactionRequest);

        } else if (request instanceof RemoteStopTransactionRequest remoteStopTransactionRequest) {
            return coreEventHandler.handleRemoteStopTransaction(identity, remoteStopTransactionRequest);

        } else if (request instanceof ResetRequest resetRequest) {
            return coreEventHandler.handleReset(identity, resetRequest);

        } else if (request instanceof UnlockConnectorRequest unlockConnectorRequest) {
            return coreEventHandler.handleUnlockConnector(identity, unlockConnectorRequest);

        } else if (request instanceof GetDiagnosticsRequest getDiagnosticsRequest) {
            return firmwareManagementEventHandler.handleGetDiagnostics(identity, getDiagnosticsRequest);

        } else if (request instanceof UpdateFirmwareRequest updateFirmwareRequest) {
            return firmwareManagementEventHandler.handleUpdateFirmware(identity, updateFirmwareRequest);

        } else if (request instanceof GetLocalListVersionRequest getLocalListVersionRequest) {
            return localAuthEventHandler.handleGetLocalListVersion(identity, getLocalListVersionRequest);

        } else if (request instanceof SendLocalListRequest sendLocalListRequest) {
            return localAuthEventHandler.handleSendLocalList(identity, sendLocalListRequest);

        } else if (request instanceof TriggerMessageRequest triggerMessageRequest) {
            return remoteTriggerEventHandler.handleTriggerMessage(identity, triggerMessageRequest);

        } else if (request instanceof ReserveNowRequest reserveNowRequest) {
            return reservationEventHandler.handleReserveNow(identity, reserveNowRequest);

        } else if (request instanceof CancelReservationRequest cancelReservationRequest) {
            return reservationEventHandler.handleCancelReservation(identity, cancelReservationRequest);

        } else if (request instanceof SetChargingProfileRequest setChargingProfileRequest) {
            return smartChargingEventHandler.handleSetChargingProfile(identity, setChargingProfileRequest);

        } else if (request instanceof ClearChargingProfileRequest clearChargingProfileRequest) {
            return smartChargingEventHandler.handleClearChargingProfile(identity, clearChargingProfileRequest);

        } else if (request instanceof GetCompositeScheduleRequest getCompositeScheduleRequest) {
            return smartChargingEventHandler.handleGetCompositeSchedule(identity, getCompositeScheduleRequest);

        } else {
            throw new UnsupportedOperationException("Unsupported request type: " + request.getClass());
        }
    }
}
