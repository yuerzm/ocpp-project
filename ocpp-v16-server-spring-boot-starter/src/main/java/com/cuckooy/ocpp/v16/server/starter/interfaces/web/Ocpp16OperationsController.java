package com.cuckooy.ocpp.v16.server.starter.interfaces.web;

import com.cuckooy.ocpp.core.message.Response;
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
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class Ocpp16OperationsController {

    private final Ocpp16ChargePointService chargePointService;

    public Ocpp16OperationsController(Ocpp16ChargePointService chargePointService) {
        this.chargePointService = chargePointService;
    }

    @PostMapping("/ocpp/v16/change-availability/{identity}")
    public Response handleChangeAvailability(@PathVariable String identity,
                                             @Validated @RequestBody ChangeAvailabilityRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/change-configuration/{identity}")
    public Response handleChangeConfiguration(@PathVariable String identity,
                                              @Validated @RequestBody ChangeConfigurationRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/clear-cache/{identity}")
    public Response handleClearCache(@PathVariable String identity, @Validated @RequestBody ClearCacheRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/data-transfer/{identity}")
    public Response handleDataTransfer(@PathVariable String identity,
                                       @Validated @RequestBody DataTransferRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/get-configuration/{identity}")
    public Response handleGetConfiguration(@PathVariable String identity,
                                           @Validated @RequestBody GetConfigurationRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/remote-start-transaction/{identity}")
    public Response handleRemoteStartTransaction(@PathVariable String identity,
                                                 @Validated @RequestBody RemoteStartTransactionRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/remote-stop-transaction/{identity}")
    public Response handleRemoteStopTransaction(@PathVariable String identity,
                                                @Validated @RequestBody RemoteStopTransactionRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/reset/{identity}")
    public Response handleReset(@PathVariable String identity, @Validated @RequestBody ResetRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/unlock-connector/{identity}")
    public Response handleUnlockConnector(@PathVariable String identity,
                                          @Validated @RequestBody UnlockConnectorRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/get-diagnostics/{identity}")
    public Response handleGetDiagnostics(@PathVariable String identity,
                                         @Validated @RequestBody GetDiagnosticsRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/update-firmware/{identity}")
    public Response handleUpdateFirmware(@PathVariable String identity,
                                         @Validated @RequestBody UpdateFirmwareRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/get-local-list-version/{identity}")
    public Response handleGetLocalListVersion(@PathVariable String identity,
                                              @Validated @RequestBody GetLocalListVersionRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/send-local-list/{identity}")
    public Response handleSendLocalList(@PathVariable String identity,
                                        @Validated @RequestBody SendLocalListRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/trigger-message/{identity}")
    public Response handleTriggerMessage(@PathVariable String identity,
                                         @Validated @RequestBody TriggerMessageRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/reserve-now/{identity}")
    public Response handleReserveNow(@PathVariable String identity, @Validated @RequestBody ReserveNowRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/cancel-reservation/{identity}")
    public Response handleCancelReservation(@PathVariable String identity,
                                            @Validated @RequestBody CancelReservationRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/set-charging-profile/{identity}")
    public Response handleSetChargingProfile(@PathVariable String identity,
                                             @Validated @RequestBody SetChargingProfileRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/clear-charging-profile/{identity}")
    public Response handleClearChargingProfile(@PathVariable String identity,
                                               @Validated @RequestBody ClearChargingProfileRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/get-composite-schedule/{identity}")
    public Response handleGetCompositeSchedule(@PathVariable String identity,
                                               @Validated @RequestBody GetCompositeScheduleRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/certificate-signed/{identity}")
    public Response handleCertificateSigned(@PathVariable String identity,
                                            @Validated @RequestBody CertificateSignedRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/delete-certificate/{identity}")
    public Response handleDeleteCertificate(@PathVariable String identity,
                                            @Validated @RequestBody DeleteCertificateRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/extended-trigger-message/{identity}")
    public Response handleExtendedTriggerMessage(@PathVariable String identity,
                                                 @Validated @RequestBody ExtendedTriggerMessageRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/get-installed-certificate-ids/{identity}")
    public Response handleGetInstalledCertificateIds(@PathVariable String identity, @Validated @RequestBody
    GetInstalledCertificateIdsRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/get-log/{identity}")
    public Response handleGetLog(@PathVariable String identity, @Validated @RequestBody GetLogRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/install-certificate/{identity}")
    public Response handleInstallCertificate(@PathVariable String identity,
                                             @Validated @RequestBody InstallCertificateRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/log-status-notification/{identity}")
    public Response handleLogStatusNotification(@PathVariable String identity,
                                                @Validated @RequestBody LogStatusNotificationRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/security-event-notification/{identity}")
    public Response handleSecurityEventNotification(@PathVariable String identity,
                                                    @Validated @RequestBody SecurityEventNotificationRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/sign-certificate/{identity}")
    public Response handleSignCertificate(@PathVariable String identity,
                                          @Validated @RequestBody SignCertificateRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/signed-firmware-status-notification/{identity}")
    public Response handleSignedFirmwareStatusNotification(@PathVariable String identity, @Validated @RequestBody
    SignedFirmwareStatusNotificationRequest request) {
        return chargePointService.handle(identity, request);
    }

    @PostMapping("/ocpp/v16/signed-update-firmware/{identity}")
    public Response handleSignedUpdateFirmware(@PathVariable String identity,
                                               @Validated @RequestBody SignedUpdateFirmwareRequest request) {
        return chargePointService.handle(identity, request);
    }
}

