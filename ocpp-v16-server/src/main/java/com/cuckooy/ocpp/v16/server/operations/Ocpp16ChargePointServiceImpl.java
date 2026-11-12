package com.cuckooy.ocpp.v16.server.operations;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.server.session.SessionUnconnectedException;
import com.cuckooy.ocpp.v16.handler.*;
import com.cuckooy.ocpp.v16.model.core.*;
import com.cuckooy.ocpp.v16.model.firmware.GetDiagnosticsRequest;
import com.cuckooy.ocpp.v16.model.firmware.UpdateFirmwareRequest;
import com.cuckooy.ocpp.v16.model.localauthlist.GetLocalListVersionRequest;
import com.cuckooy.ocpp.v16.model.localauthlist.SendLocalListRequest;
import com.cuckooy.ocpp.v16.model.remotetrigger.TriggerMessageRequest;
import com.cuckooy.ocpp.v16.model.reservation.CancelReservationRequest;
import com.cuckooy.ocpp.v16.model.reservation.ReserveNowRequest;
import com.cuckooy.ocpp.v16.model.security.*;
import com.cuckooy.ocpp.v16.model.smartcharging.ClearChargingProfileRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.GetCompositeScheduleRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.SetChargingProfileRequest;
import com.cuckooy.ocpp.v16.operation.Ocpp16ChargePointService;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;
import com.cuckooy.ocpp.v16.server.handler.*;
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
    private final ChargePointSecurityEventHandler securityEventHandler;

    /**
     * Instantiates a new Ocpp 16 charge point service.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public Ocpp16ChargePointServiceImpl(Ocpp16ServerTransport serverTransport, SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
        this.coreEventHandler = new ChargePointCoreEventHandlerImpl(serverTransport, sessionRepository);
        this.firmwareManagementEventHandler =
            new ChargePointFirmwareManagementEventHandlerImpl(serverTransport, sessionRepository);
        this.localAuthEventHandler = new ChargePointLocalAuthEventHandlerImpl(serverTransport, sessionRepository);
        this.remoteTriggerEventHandler =
            new ChargePointRemoteTriggerEventHandlerImpl(serverTransport, sessionRepository);
        this.reservationEventHandler = new ChargePointReservationEventHandlerImpl(serverTransport, sessionRepository);
        this.smartChargingEventHandler =
            new ChargePointSmartChargingEventHandlerImpl(serverTransport, sessionRepository);
        this.securityEventHandler = new ChargePointSecurityEventHandlerImpl(serverTransport, sessionRepository);
    }

    @Override
    public Response handle(String identity, Request request) {

        Optional<WebSocketSession> optional = sessionRepository.get(identity);
        if (optional.isEmpty()) {
            logger.warn("Charge Point with identity: {} not connected, with request: {}", identity, request);
            throw new SessionUnconnectedException("Charge Point with identity " + identity + " not connected.");
        }

        if (request instanceof ChangeAvailabilityRequest changeAvailabilityRequest) {
            return coreEventHandler.handleChangeAvailability(identity, changeAvailabilityRequest);
        }

        if (request instanceof ChangeConfigurationRequest changeConfigurationRequest) {
            return coreEventHandler.handleChangeConfiguration(identity, changeConfigurationRequest);
        }

        if (request instanceof ClearCacheRequest clearCacheRequest) {
            return coreEventHandler.handleClearCache(identity, clearCacheRequest);
        }

        if (request instanceof DataTransferRequest dataTransferRequest) {
            return coreEventHandler.handleDataTransfer(identity, dataTransferRequest);
        }

        if (request instanceof GetConfigurationRequest getConfigurationRequest) {
            return coreEventHandler.handleGetConfiguration(identity, getConfigurationRequest);
        }

        if (request instanceof RemoteStartTransactionRequest remoteStartTransactionRequest) {
            return coreEventHandler.handleRemoteStartTransaction(identity, remoteStartTransactionRequest);
        }

        if (request instanceof RemoteStopTransactionRequest remoteStopTransactionRequest) {
            return coreEventHandler.handleRemoteStopTransaction(identity, remoteStopTransactionRequest);
        }

        if (request instanceof ResetRequest resetRequest) {
            return coreEventHandler.handleReset(identity, resetRequest);
        }

        if (request instanceof UnlockConnectorRequest unlockConnectorRequest) {
            return coreEventHandler.handleUnlockConnector(identity, unlockConnectorRequest);
        }

        if (request instanceof GetDiagnosticsRequest getDiagnosticsRequest) {
            return firmwareManagementEventHandler.handleGetDiagnostics(identity, getDiagnosticsRequest);
        }

        if (request instanceof UpdateFirmwareRequest updateFirmwareRequest) {
            return firmwareManagementEventHandler.handleUpdateFirmware(identity, updateFirmwareRequest);
        }

        if (request instanceof GetLocalListVersionRequest getLocalListVersionRequest) {
            return localAuthEventHandler.handleGetLocalListVersion(identity, getLocalListVersionRequest);
        }

        if (request instanceof SendLocalListRequest sendLocalListRequest) {
            return localAuthEventHandler.handleSendLocalList(identity, sendLocalListRequest);
        }

        if (request instanceof TriggerMessageRequest triggerMessageRequest) {
            return remoteTriggerEventHandler.handleTriggerMessage(identity, triggerMessageRequest);
        }

        if (request instanceof ReserveNowRequest reserveNowRequest) {
            return reservationEventHandler.handleReserveNow(identity, reserveNowRequest);
        }

        if (request instanceof CancelReservationRequest cancelReservationRequest) {
            return reservationEventHandler.handleCancelReservation(identity, cancelReservationRequest);
        }

        if (request instanceof SetChargingProfileRequest setChargingProfileRequest) {
            return smartChargingEventHandler.handleSetChargingProfile(identity, setChargingProfileRequest);
        }

        if (request instanceof ClearChargingProfileRequest clearChargingProfileRequest) {
            return smartChargingEventHandler.handleClearChargingProfile(identity, clearChargingProfileRequest);
        }

        if (request instanceof GetCompositeScheduleRequest getCompositeScheduleRequest) {
            return smartChargingEventHandler.handleGetCompositeSchedule(identity, getCompositeScheduleRequest);
        }

        if (request instanceof CertificateSignedRequest certificateSignedRequest) {
            return securityEventHandler.handleCertificateSigned(identity, certificateSignedRequest);
        }

        if (request instanceof DeleteCertificateRequest deleteCertificateRequest) {
            return securityEventHandler.handleDeleteCertificate(identity, deleteCertificateRequest);
        }

        if (request instanceof ExtendedTriggerMessageRequest extendedTriggerMessageRequest) {
            return securityEventHandler.handleExtendedTriggerMessage(identity, extendedTriggerMessageRequest);
        }

        if (request instanceof GetInstalledCertificateIdsRequest getInstalledCertificateIdsRequest) {
            return securityEventHandler.handleGetInstalledCertificateIds(identity, getInstalledCertificateIdsRequest);
        }

        if (request instanceof GetLogRequest getLogRequest) {
            return securityEventHandler.handleGetLog(identity, getLogRequest);
        }

        if (request instanceof InstallCertificateRequest installCertificateRequest) {
            return securityEventHandler.handleInstallCertificate(identity, installCertificateRequest);
        }

        if (request instanceof LogStatusNotificationRequest logStatusNotificationRequest) {
            return securityEventHandler.handleLogStatusNotification(identity, logStatusNotificationRequest);
        }

        if (request instanceof SecurityEventNotificationRequest securityEventNotificationRequest) {
            return securityEventHandler.handleSecurityEventNotification(identity, securityEventNotificationRequest);
        }

        if (request instanceof SignCertificateRequest signCertificateRequest) {
            return securityEventHandler.handleSignCertificate(identity, signCertificateRequest);
        }

        if (request instanceof SignedFirmwareStatusNotificationRequest signedFirmwareStatusNotificationRequest) {
            return securityEventHandler.handleSignedFirmwareStatusNotification(identity,
                signedFirmwareStatusNotificationRequest);
        }

        if (request instanceof SignedUpdateFirmwareRequest signedUpdateFirmwareRequest) {
            return securityEventHandler.handleSignedUpdateFirmware(identity, signedUpdateFirmwareRequest);
        }

        throw new UnsupportedOperationException("Unsupported request type: " + request.getClass());
    }
}
