package com.tatadok.ocpp.v20.server.operations;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.v20.handler.ChargePointAuthorizationEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointAvailabilityEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointDataTransferEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointDiagnosticsEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointDisplayMessageEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointFirmwareManagementEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointISO15118CertificateManagementEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointLocalAuthorizationListEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointProvisioningEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointRemoteControlEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointReservationEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointSecurityEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointSmartChargingEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointTariffAndCostEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointTransactionsEventHandler;
import com.tatadok.ocpp.v20.model.authorization.ClearCacheRequest;
import com.tatadok.ocpp.v20.model.availability.ChangeAvailabilityRequest;
import com.tatadok.ocpp.v20.model.cost.CostUpdatedRequest;
import com.tatadok.ocpp.v20.model.datatransfer.DataTransferRequest;
import com.tatadok.ocpp.v20.model.diagnostics.ClearVariableMonitoringRequest;
import com.tatadok.ocpp.v20.model.diagnostics.CustomerInformationRequest;
import com.tatadok.ocpp.v20.model.diagnostics.GetLogRequest;
import com.tatadok.ocpp.v20.model.diagnostics.GetMonitoringReportRequest;
import com.tatadok.ocpp.v20.model.diagnostics.NotifyMonitoringReportRequest;
import com.tatadok.ocpp.v20.model.diagnostics.SetMonitoringBaseRequest;
import com.tatadok.ocpp.v20.model.diagnostics.SetMonitoringLevelRequest;
import com.tatadok.ocpp.v20.model.diagnostics.SetVariableMonitoringRequest;
import com.tatadok.ocpp.v20.model.displaymessage.ClearDisplayMessageRequest;
import com.tatadok.ocpp.v20.model.displaymessage.GetDisplayMessagesRequest;
import com.tatadok.ocpp.v20.model.displaymessage.SetDisplayMessageRequest;
import com.tatadok.ocpp.v20.model.firmware.PublishFirmwareRequest;
import com.tatadok.ocpp.v20.model.firmware.UnpublishFirmwareRequest;
import com.tatadok.ocpp.v20.model.firmware.UpdateFirmwareRequest;
import com.tatadok.ocpp.v20.model.iso15118.DeleteCertificateRequest;
import com.tatadok.ocpp.v20.model.iso15118.GetInstalledCertificateIdsRequest;
import com.tatadok.ocpp.v20.model.iso15118.InstallCertificateRequest;
import com.tatadok.ocpp.v20.model.localauth.GetLocalListVersionRequest;
import com.tatadok.ocpp.v20.model.localauth.SendLocalListRequest;
import com.tatadok.ocpp.v20.model.provisioning.GetBaseReportRequest;
import com.tatadok.ocpp.v20.model.provisioning.GetReportRequest;
import com.tatadok.ocpp.v20.model.provisioning.GetVariablesRequest;
import com.tatadok.ocpp.v20.model.provisioning.ResetRequest;
import com.tatadok.ocpp.v20.model.provisioning.SetNetworkProfileRequest;
import com.tatadok.ocpp.v20.model.provisioning.SetVariablesRequest;
import com.tatadok.ocpp.v20.model.remote.RequestStartTransactionRequest;
import com.tatadok.ocpp.v20.model.remote.RequestStopTransactionRequest;
import com.tatadok.ocpp.v20.model.remote.TriggerMessageRequest;
import com.tatadok.ocpp.v20.model.remote.UnlockConnectorRequest;
import com.tatadok.ocpp.v20.model.reservation.CancelReservationRequest;
import com.tatadok.ocpp.v20.model.reservation.ReserveNowRequest;
import com.tatadok.ocpp.v20.model.security.CertificateSignedRequest;
import com.tatadok.ocpp.v20.model.smartcharging.ClearChargingProfileRequest;
import com.tatadok.ocpp.v20.model.smartcharging.GetChargingProfilesRequest;
import com.tatadok.ocpp.v20.model.smartcharging.GetCompositeScheduleRequest;
import com.tatadok.ocpp.v20.model.smartcharging.SetChargingProfileRequest;
import com.tatadok.ocpp.v20.model.transactions.GetTransactionStatusRequest;
import com.tatadok.ocpp.v20.operations.Ocpp20ChargePointService;
import com.tatadok.ocpp.v20.server.Ocpp20ServerTransport;
import com.tatadok.ocpp.v20.server.handler.ChargePointAuthorizationEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointAvailabilityEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointDataTransferEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointDiagnosticsEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointDisplayMessageEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointFirmwareManagementManagementEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointISO15118CertificateManagementEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointLocalAuthorizationListEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointProvisioningEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointRemoteControlEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointReservationEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointSecurityEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointSmartChargingEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointTariffAndCostEventHandlerImpl;
import com.tatadok.ocpp.v20.server.handler.ChargePointTransactionsEventHandlerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.WebSocketSession;

import java.util.Optional;

public class Ocpp20ChargePointServiceImpl implements Ocpp20ChargePointService {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    private final SessionRepository sessionRepository;
    private final ChargePointAuthorizationEventHandler authorizationEventHandler;
    private final ChargePointAvailabilityEventHandler availabilityEventHandler;
    private final ChargePointTariffAndCostEventHandler tariffAndCostEventHandler;
    private final ChargePointDataTransferEventHandler dataTransferEventHandler;
    private final ChargePointDiagnosticsEventHandler diagnosticsEventHandler;
    private final ChargePointDisplayMessageEventHandler displayMessageEventHandler;
    private final ChargePointFirmwareManagementEventHandler firmwareManagementEventHandler;
    private final ChargePointISO15118CertificateManagementEventHandler iso15118CertificateManagementEventHandler;
    private final ChargePointLocalAuthorizationListEventHandler localAuthorizationListEventHandler;
    private final ChargePointProvisioningEventHandler provisioningEventHandler;
    private final ChargePointRemoteControlEventHandler remoteControlEventHandler;
    private final ChargePointReservationEventHandler reservationEventHandler;
    private final ChargePointSecurityEventHandler securityEventHandler;
    private final ChargePointSmartChargingEventHandler smartChargingEventHandler;
    private final ChargePointTransactionsEventHandler transactionsEventHandler;

    public Ocpp20ChargePointServiceImpl(Ocpp20ServerTransport serverTransport, SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
        this.authorizationEventHandler = new ChargePointAuthorizationEventHandlerImpl(serverTransport,
            sessionRepository);
        this.availabilityEventHandler = new ChargePointAvailabilityEventHandlerImpl(serverTransport, sessionRepository);
        this.tariffAndCostEventHandler = new ChargePointTariffAndCostEventHandlerImpl(serverTransport,
            sessionRepository);
        this.dataTransferEventHandler = new ChargePointDataTransferEventHandlerImpl(serverTransport, sessionRepository);
        this.diagnosticsEventHandler = new ChargePointDiagnosticsEventHandlerImpl(serverTransport, sessionRepository);
        this.displayMessageEventHandler = new ChargePointDisplayMessageEventHandlerImpl(serverTransport,
            sessionRepository);
        this.firmwareManagementEventHandler = new ChargePointFirmwareManagementManagementEventHandlerImpl(
            serverTransport, sessionRepository);
        this.iso15118CertificateManagementEventHandler = new ChargePointISO15118CertificateManagementEventHandlerImpl(
            serverTransport, sessionRepository);
        this.localAuthorizationListEventHandler = new ChargePointLocalAuthorizationListEventHandlerImpl(serverTransport,
            sessionRepository);
        this.provisioningEventHandler = new ChargePointProvisioningEventHandlerImpl(serverTransport, sessionRepository);
        this.remoteControlEventHandler = new ChargePointRemoteControlEventHandlerImpl(serverTransport,
            sessionRepository);
        this.reservationEventHandler = new ChargePointReservationEventHandlerImpl(serverTransport, sessionRepository);
        this.securityEventHandler = new ChargePointSecurityEventHandlerImpl(serverTransport, sessionRepository);
        this.smartChargingEventHandler = new ChargePointSmartChargingEventHandlerImpl(serverTransport,
            sessionRepository);
        this.transactionsEventHandler = new ChargePointTransactionsEventHandlerImpl(serverTransport, sessionRepository);
    }

    @Override
    public Response handle(String sessionId, String identity, Request request) {

        Optional<WebSocketSession> optional = sessionRepository.get(sessionId, identity);
        if (optional.isEmpty()) {
            logger.warn("Session not connected, session: {}, identity {}", sessionId, identity);
            throw new UnsupportedOperationException("Session with id " + sessionId + " not connected.");
        }

        if (request instanceof ClearCacheRequest clearCacheRequest) {
            return authorizationEventHandler.handleClearCache(sessionId, identity, clearCacheRequest);

        } else if (request instanceof ChangeAvailabilityRequest changeAvailabilityRequest) {
            return availabilityEventHandler.handleChangeAvailability(sessionId, identity, changeAvailabilityRequest);

        } else if (request instanceof CostUpdatedRequest costUpdatedRequest) {
            return tariffAndCostEventHandler.handleCostUpdated(sessionId, identity, costUpdatedRequest);

        } else if (request instanceof DataTransferRequest dataTransferRequest) {
            return dataTransferEventHandler.handleDataTransfer(sessionId, identity, dataTransferRequest);

        } else if (request instanceof ClearVariableMonitoringRequest clearVariableMonitoringRequest) {
            return diagnosticsEventHandler.handleClearVariableMonitoring(sessionId, identity,
                clearVariableMonitoringRequest);

        } else if (request instanceof CustomerInformationRequest customerInformationRequest) {
            return diagnosticsEventHandler.handleCustomerInformation(sessionId, identity, customerInformationRequest);

        } else if (request instanceof GetLogRequest getLogRequest) {
            return diagnosticsEventHandler.handleGetLog(sessionId, identity, getLogRequest);

        } else if (request instanceof GetMonitoringReportRequest getMonitoringReportRequest) {
            return diagnosticsEventHandler.handleGetMonitoringReport(sessionId, identity, getMonitoringReportRequest);

        } else if (request instanceof NotifyMonitoringReportRequest getMonitoringReportRequest) {
            return diagnosticsEventHandler.handleNotifyMonitoringReport(sessionId, identity,
                getMonitoringReportRequest);

        } else if (request instanceof SetMonitoringBaseRequest setMonitoringBaseRequest) {
            return diagnosticsEventHandler.handleSetMonitoringBase(sessionId, identity, setMonitoringBaseRequest);

        } else if (request instanceof SetMonitoringLevelRequest setMonitoringLevelRequest) {
            return diagnosticsEventHandler.handleSetMonitoringLevel(sessionId, identity, setMonitoringLevelRequest);

        } else if (request instanceof SetVariableMonitoringRequest setVariableMonitoringRequest) {
            return diagnosticsEventHandler.handleSetVariableMonitoring(sessionId, identity,
                setVariableMonitoringRequest);

        } else if (request instanceof ClearDisplayMessageRequest clearDisplayMessageRequest) {
            return displayMessageEventHandler.handleClearDisplayMessage(sessionId, identity,
                clearDisplayMessageRequest);

        } else if (request instanceof GetDisplayMessagesRequest getDisplayMessagesRequest) {
            return displayMessageEventHandler.handleGetDisplayMessages(sessionId, identity, getDisplayMessagesRequest);

        } else if (request instanceof SetDisplayMessageRequest setDisplayMessageRequest) {
            return displayMessageEventHandler.handleSetDisplayMessage(sessionId, identity, setDisplayMessageRequest);

        } else if (request instanceof PublishFirmwareRequest publishFirmwareRequest) {
            return firmwareManagementEventHandler.handlePublishFirmware(sessionId, identity, publishFirmwareRequest);

        } else if (request instanceof UnpublishFirmwareRequest unpublishFirmwareRequest) {
            return firmwareManagementEventHandler.handleUnpublishFirmware(sessionId, identity,
                unpublishFirmwareRequest);

        } else if (request instanceof UpdateFirmwareRequest updateFirmwareRequest) {
            return firmwareManagementEventHandler.handleUpdateFirmware(sessionId, identity, updateFirmwareRequest);

        } else if (request instanceof DeleteCertificateRequest deleteCertificateRequest) {
            return iso15118CertificateManagementEventHandler.handleDeleteCertificate(sessionId, identity,
                deleteCertificateRequest);

        } else if (request instanceof InstallCertificateRequest installCertificateRequest) {
            return iso15118CertificateManagementEventHandler.handleInstallCertificate(sessionId, identity,
                installCertificateRequest);

        } else if (request instanceof GetInstalledCertificateIdsRequest getInstalledCertificateIdsRequest) {
            return iso15118CertificateManagementEventHandler.handleGetInstalledCertificateIds(sessionId, identity,
                getInstalledCertificateIdsRequest);

        } else if (request instanceof SendLocalListRequest sendLocalListRequest) {
            return localAuthorizationListEventHandler.handleSendLocalList(sessionId, identity, sendLocalListRequest);

        } else if (request instanceof GetLocalListVersionRequest getLocalListVersionRequest) {
            return localAuthorizationListEventHandler.handleGetLocalListVersion(sessionId, identity,
                getLocalListVersionRequest);

        } else if (request instanceof GetBaseReportRequest getBaseReportRequest) {
            return provisioningEventHandler.handleGetBaseReport(sessionId, identity, getBaseReportRequest);

        } else if (request instanceof GetReportRequest getReportRequest) {
            return provisioningEventHandler.handleGetReport(sessionId, identity, getReportRequest);

        } else if (request instanceof GetVariablesRequest getVariablesRequest) {
            return provisioningEventHandler.handleGetVariables(sessionId, identity, getVariablesRequest);

        } else if (request instanceof SetVariablesRequest setVariablesRequest) {
            return provisioningEventHandler.handleSetVariables(sessionId, identity, setVariablesRequest);

        } else if (request instanceof ResetRequest resetRequest) {
            return provisioningEventHandler.handleReset(sessionId, identity, resetRequest);

            // } else if (request instanceof NotifyReportRequest notifyReportRequest) {
            //     return provisioningEventHandler.handleNotifyReport(sessionId, identity, notifyReportRequest);

        } else if (request instanceof SetNetworkProfileRequest setNetworkProfileRequest) {
            return provisioningEventHandler.handleSetNetworkProfile(sessionId, identity, setNetworkProfileRequest);

        } else if (request instanceof RequestStartTransactionRequest requestStartTransactionRequest) {
            return remoteControlEventHandler.handleRequestStartTransaction(sessionId, identity,
                requestStartTransactionRequest);

        } else if (request instanceof RequestStopTransactionRequest requestStopTransactionRequest) {
            return remoteControlEventHandler.handleRequestStopTransaction(sessionId, identity,
                requestStopTransactionRequest);

        } else if (request instanceof TriggerMessageRequest triggerMessageRequest) {
            return remoteControlEventHandler.handleTriggerMessage(sessionId, identity, triggerMessageRequest);

        } else if (request instanceof UnlockConnectorRequest unlockConnectorRequest) {
            return remoteControlEventHandler.handleUnlockConnector(sessionId, identity, unlockConnectorRequest);

        } else if (request instanceof ReserveNowRequest reserveNowRequest) {
            return reservationEventHandler.handleReserveNow(sessionId, identity, reserveNowRequest);

        } else if (request instanceof CancelReservationRequest cancelReservationRequest) {
            return reservationEventHandler.handleCancelReservation(sessionId, identity, cancelReservationRequest);

        } else if (request instanceof CertificateSignedRequest certificateSignedRequest) {
            return securityEventHandler.handleCertificateSigned(sessionId, identity, certificateSignedRequest);

        } else if (request instanceof ClearChargingProfileRequest clearChargingProfileRequest) {
            return smartChargingEventHandler.handleClearChargingProfile(sessionId, identity,
                clearChargingProfileRequest);

        } else if (request instanceof GetChargingProfilesRequest getChargingProfilesRequest) {
            return smartChargingEventHandler.handleGetChargingProfiles(sessionId, identity, getChargingProfilesRequest);

        } else if (request instanceof GetCompositeScheduleRequest getCompositeScheduleRequest) {
            return smartChargingEventHandler.handleGetCompositeSchedule(sessionId, identity,
                getCompositeScheduleRequest);

        } else if (request instanceof SetChargingProfileRequest setChargingProfileRequest) {
            return smartChargingEventHandler.handleSetChargingProfile(sessionId, identity, setChargingProfileRequest);

        } else if (request instanceof GetTransactionStatusRequest getTransactionStatusRequest) {
            return transactionsEventHandler.handleGetTransactionStatus(sessionId, identity,
                getTransactionStatusRequest);

        } else {
            throw new UnsupportedOperationException("Unsupported request type: " + request.getClass());
        }
    }
}
