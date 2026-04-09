package com.cuckooy.ocpp.v20.server.operations;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.handler.CentralSystemAuthorizationEventHandler;
import com.cuckooy.ocpp.v20.handler.CentralSystemAvailabilityEventHandler;
import com.cuckooy.ocpp.v20.handler.CentralSystemDataTransferEventHandler;
import com.cuckooy.ocpp.v20.handler.CentralSystemDiagnosticsEventHandler;
import com.cuckooy.ocpp.v20.handler.CentralSystemDisplayEventHandler;
import com.cuckooy.ocpp.v20.handler.CentralSystemFirmwareEventHandler;
import com.cuckooy.ocpp.v20.handler.CentralSystemISO15118EventHandler;
import com.cuckooy.ocpp.v20.handler.CentralSystemMeterValuesEventHandler;
import com.cuckooy.ocpp.v20.handler.CentralSystemProvisioningEventHandler;
import com.cuckooy.ocpp.v20.handler.CentralSystemReservationEventHandler;
import com.cuckooy.ocpp.v20.handler.CentralSystemSecurityEventHandler;
import com.cuckooy.ocpp.v20.handler.CentralSystemSmartChargingEventHandler;
import com.cuckooy.ocpp.v20.handler.CentralSystemTransactionsEventHandler;
import com.cuckooy.ocpp.v20.model.authorization.AuthorizeRequest;
import com.cuckooy.ocpp.v20.model.availability.HeartbeatRequest;
import com.cuckooy.ocpp.v20.model.availability.NotifyEventRequest;
import com.cuckooy.ocpp.v20.model.availability.StatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.datatransfer.DataTransferRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.LogStatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.NotifyCustomerInformationRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.NotifyDisplayMessagesRequest;
import com.cuckooy.ocpp.v20.model.firmware.FirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.firmware.PublishFirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.iso15118.Get15118EVCertificateRequest;
import com.cuckooy.ocpp.v20.model.iso15118.GetCertificateStatusRequest;
import com.cuckooy.ocpp.v20.model.metervalues.MeterValuesRequest;
import com.cuckooy.ocpp.v20.model.provisioning.BootNotificationRequest;
import com.cuckooy.ocpp.v20.model.provisioning.NotifyReportRequest;
import com.cuckooy.ocpp.v20.model.reservation.ReservationStatusUpdateRequest;
import com.cuckooy.ocpp.v20.model.security.SecurityEventNotificationRequest;
import com.cuckooy.ocpp.v20.model.security.SignCertificateRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.ClearedChargingLimitRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyChargingLimitRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyEVChargingNeedsRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyEVChargingScheduleRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.ReportChargingProfilesRequest;
import com.cuckooy.ocpp.v20.model.transactions.TransactionEventRequest;
import com.cuckooy.ocpp.v20.operations.Ocpp20CentralSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Ocpp 20 central system service.
 */
public class Ocpp20CentralSystemServiceImpl implements Ocpp20CentralSystemService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final CentralSystemAuthorizationEventHandler authorizationEventHandler;
    private final CentralSystemAvailabilityEventHandler availabilityEventHandler;
    private final CentralSystemDataTransferEventHandler dataTransferEventHandler;
    private final CentralSystemDiagnosticsEventHandler diagnosticsEventHandler;
    private final CentralSystemDisplayEventHandler displayEventHandler;
    private final CentralSystemFirmwareEventHandler firmwareEventHandler;
    private final CentralSystemISO15118EventHandler iso15118EventHandler;
    private final CentralSystemMeterValuesEventHandler meterValuesEventHandler;
    private final CentralSystemProvisioningEventHandler provisioningEventHandler;
    private final CentralSystemReservationEventHandler reservationEventHandler;
    private final CentralSystemSecurityEventHandler securityEventHandler;
    private final CentralSystemSmartChargingEventHandler smartChargingEventHandler;
    private final CentralSystemTransactionsEventHandler transactionsEventHandler;

    /**
     * Instantiates a new Ocpp 20 central system service.
     *
     * @param authorizationEventHandler the authorization event handler
     * @param availabilityEventHandler  the availability event handler
     * @param dataTransferEventHandler  the data transfer event handler
     * @param diagnosticsEventHandler   the diagnostics event handler
     * @param displayEventHandler       the display event handler
     * @param firmwareEventHandler      the firmware event handler
     * @param iso15118EventHandler      the iso 15118 event handler
     * @param meterValuesEventHandler   the meter values event handler
     * @param provisioningEventHandler  the provisioning event handler
     * @param reservationEventHandler   the reservation event handler
     * @param securityEventHandler      the security event handler
     * @param smartChargingEventHandler the smart charging event handler
     * @param transactionsEventHandler  the transactions event handler
     */
    public Ocpp20CentralSystemServiceImpl(CentralSystemAuthorizationEventHandler authorizationEventHandler,
                                          CentralSystemAvailabilityEventHandler availabilityEventHandler,
                                          CentralSystemDataTransferEventHandler dataTransferEventHandler,
                                          CentralSystemDiagnosticsEventHandler diagnosticsEventHandler,
                                          CentralSystemDisplayEventHandler displayEventHandler,
                                          CentralSystemFirmwareEventHandler firmwareEventHandler,
                                          CentralSystemISO15118EventHandler iso15118EventHandler,
                                          CentralSystemMeterValuesEventHandler meterValuesEventHandler,
                                          CentralSystemProvisioningEventHandler provisioningEventHandler,
                                          CentralSystemReservationEventHandler reservationEventHandler,
                                          CentralSystemSecurityEventHandler securityEventHandler,
                                          CentralSystemSmartChargingEventHandler smartChargingEventHandler,
                                          CentralSystemTransactionsEventHandler transactionsEventHandler) {
        this.authorizationEventHandler = authorizationEventHandler;
        this.availabilityEventHandler = availabilityEventHandler;
        this.dataTransferEventHandler = dataTransferEventHandler;
        this.diagnosticsEventHandler = diagnosticsEventHandler;
        this.displayEventHandler = displayEventHandler;
        this.firmwareEventHandler = firmwareEventHandler;
        this.iso15118EventHandler = iso15118EventHandler;
        this.meterValuesEventHandler = meterValuesEventHandler;
        this.provisioningEventHandler = provisioningEventHandler;
        this.reservationEventHandler = reservationEventHandler;
        this.securityEventHandler = securityEventHandler;
        this.smartChargingEventHandler = smartChargingEventHandler;
        this.transactionsEventHandler = transactionsEventHandler;
    }

    @Override
    public Response handle(String identity, Request request) {

        logger.info("Handle identity: {}, request {}", identity, request);

        if (request instanceof AuthorizeRequest req) {
            return authorizationEventHandler.handleAuthorize(identity, req);

        } else if (request instanceof HeartbeatRequest req) {
            return availabilityEventHandler.handleHeartbeat(identity, req);

        } else if (request instanceof NotifyEventRequest req) {
            return availabilityEventHandler.handleNotifyEvent(identity, req);

        } else if (request instanceof StatusNotificationRequest req) {
            return availabilityEventHandler.handleStatusNotification(identity, req);

        } else if (request instanceof DataTransferRequest req) {
            return dataTransferEventHandler.handleDataTransfer(identity, req);

        } else if (request instanceof LogStatusNotificationRequest req) {
            return diagnosticsEventHandler.handleLogStatusNotification(identity, req);

        } else if (request instanceof NotifyCustomerInformationRequest req) {
            return diagnosticsEventHandler.handleNotifyCustomerInformation(identity, req);

        } else if (request instanceof NotifyDisplayMessagesRequest req) {
            return displayEventHandler.handleNotifyDisplayMessages(identity, req);

        } else if (request instanceof FirmwareStatusNotificationRequest req) {
            return firmwareEventHandler.handleFirmwareStatusNotification(identity, req);

        } else if (request instanceof PublishFirmwareStatusNotificationRequest req) {
            return firmwareEventHandler.handlePublishFirmwareStatusNotification(identity, req);

        } else if (request instanceof GetCertificateStatusRequest req) {
            return iso15118EventHandler.handleGetCertificateStatus(identity, req);

        } else if (request instanceof Get15118EVCertificateRequest req) {
            return iso15118EventHandler.handleGet15118EVCertificate(identity, req);

        } else if (request instanceof MeterValuesRequest req) {
            return meterValuesEventHandler.handleMeterValues(identity, req);

        } else if (request instanceof BootNotificationRequest req) {
            return provisioningEventHandler.handleBootNotification(identity, req);

        } else if (request instanceof NotifyReportRequest req) {
            return provisioningEventHandler.handleNotifyReport(identity, req);

        } else if (request instanceof ReservationStatusUpdateRequest req) {
            return reservationEventHandler.handleReservationStatusUpdate(identity, req);

        } else if (request instanceof SignCertificateRequest req) {
            return securityEventHandler.handleSignCertificate(identity, req);

        } else if (request instanceof SecurityEventNotificationRequest req) {
            return securityEventHandler.handleSecurityEventNotification(identity, req);

        } else if (request instanceof ClearedChargingLimitRequest req) {
            return smartChargingEventHandler.handleClearedChargingLimit(identity, req);

        } else if (request instanceof NotifyChargingLimitRequest req) {
            return smartChargingEventHandler.handleNotifyChargingLimit(identity, req);

        } else if (request instanceof NotifyEVChargingNeedsRequest req) {
            return smartChargingEventHandler.handleNotifyEVChargingNeeds(identity, req);

        } else if (request instanceof NotifyEVChargingScheduleRequest req) {
            return smartChargingEventHandler.handleNotifyEVChargingSchedule(identity, req);

        } else if (request instanceof ReportChargingProfilesRequest req) {
            return smartChargingEventHandler.handleReportChargingProfiles(identity, req);

        } else if (request instanceof TransactionEventRequest req) {
            return transactionsEventHandler.handleTransactionEvent(identity, req);

        } else {
            throw new UnsupportedOperationException("Unsupported request type: " + request.getClass());
        }
    }
}
