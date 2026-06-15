package com.cuckooy.ocpp.v16.server.netty.operations;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointCoreEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointFirmwareManagementEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointLocalAuthEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointRemoteTriggerEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointReservationEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointSecurityEventHandler;
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
import com.cuckooy.ocpp.v16.model.security.CertificateSignedRequest;
import com.cuckooy.ocpp.v16.model.security.DeleteCertificateRequest;
import com.cuckooy.ocpp.v16.model.security.ExtendedTriggerMessageRequest;
import com.cuckooy.ocpp.v16.model.security.GetInstalledCertificateIdsRequest;
import com.cuckooy.ocpp.v16.model.security.GetLogRequest;
import com.cuckooy.ocpp.v16.model.security.InstallCertificateRequest;
import com.cuckooy.ocpp.v16.model.security.LogStatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.security.SecurityEventNotificationRequest;
import com.cuckooy.ocpp.v16.model.security.SignCertificateRequest;
import com.cuckooy.ocpp.v16.model.security.SignedFirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.security.SignedUpdateFirmwareRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.ClearChargingProfileRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.GetCompositeScheduleRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.SetChargingProfileRequest;
import com.cuckooy.ocpp.v16.operation.Ocpp16ChargePointService;
import com.cuckooy.ocpp.v16.server.netty.Ocpp16NettyServerTransport;
import com.cuckooy.ocpp.v16.server.netty.handler.ChargePointCoreEventHandlerImpl;
import com.cuckooy.ocpp.v16.server.netty.handler.ChargePointFirmwareManagementEventHandlerImpl;
import com.cuckooy.ocpp.v16.server.netty.handler.ChargePointLocalAuthEventHandlerImpl;
import com.cuckooy.ocpp.v16.server.netty.handler.ChargePointRemoteTriggerEventHandlerImpl;
import com.cuckooy.ocpp.v16.server.netty.handler.ChargePointReservationEventHandlerImpl;
import com.cuckooy.ocpp.v16.server.netty.handler.ChargePointSecurityEventHandlerImpl;
import com.cuckooy.ocpp.v16.server.netty.handler.ChargePointSmartChargingEventHandlerImpl;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * OCPP 1.6 Charge Point Service implementation for Netty transport.
 * <p>
 * Aggregates all v1.6 downstream handlers and dispatches incoming requests by type.
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

    public Ocpp16ChargePointServiceImpl(Ocpp16NettyServerTransport serverTransport, SessionRepository sessionRepository) {
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

        Optional<Channel> optional = sessionRepository.get(identity);
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

        } else if (request instanceof CertificateSignedRequest certificateSignedRequest) {
            return securityEventHandler.handleCertificateSigned(identity, certificateSignedRequest);

        } else if (request instanceof DeleteCertificateRequest deleteCertificateRequest) {
            return securityEventHandler.handleDeleteCertificate(identity, deleteCertificateRequest);

        } else if (request instanceof ExtendedTriggerMessageRequest extendedTriggerMessageRequest) {
            return securityEventHandler.handleExtendedTriggerMessage(identity, extendedTriggerMessageRequest);

        } else if (request instanceof GetInstalledCertificateIdsRequest getInstalledCertificateIdsRequest) {
            return securityEventHandler.handleGetInstalledCertificateIds(identity, getInstalledCertificateIdsRequest);

        } else if (request instanceof GetLogRequest getLogRequest) {
            return securityEventHandler.handleGetLog(identity, getLogRequest);

        } else if (request instanceof InstallCertificateRequest installCertificateRequest) {
            return securityEventHandler.handleInstallCertificate(identity, installCertificateRequest);

        } else if (request instanceof LogStatusNotificationRequest logStatusNotificationRequest) {
            return securityEventHandler.handleLogStatusNotification(identity, logStatusNotificationRequest);

        } else if (request instanceof SecurityEventNotificationRequest securityEventNotificationRequest) {
            return securityEventHandler.handleSecurityEventNotification(identity, securityEventNotificationRequest);

        } else if (request instanceof SignCertificateRequest signCertificateRequest) {
            return securityEventHandler.handleSignCertificate(identity, signCertificateRequest);

        } else if (request instanceof SignedFirmwareStatusNotificationRequest signedFirmwareStatusNotificationRequest) {
            return securityEventHandler.handleSignedFirmwareStatusNotification(identity,
                signedFirmwareStatusNotificationRequest);

        } else if (request instanceof SignedUpdateFirmwareRequest signedUpdateFirmwareRequest) {
            return securityEventHandler.handleSignedUpdateFirmware(identity, signedUpdateFirmwareRequest);

        } else {
            throw new UnsupportedOperationException("Unsupported request type: " + request.getClass());
        }
    }
}
