package com.cuckooy.ocpp.v20.model;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.authorization.AuthorizeRequest;
import com.cuckooy.ocpp.v20.model.authorization.AuthorizeResponse;
import com.cuckooy.ocpp.v20.model.authorization.ClearCacheRequest;
import com.cuckooy.ocpp.v20.model.authorization.ClearCacheResponse;
import com.cuckooy.ocpp.v20.model.availability.ChangeAvailabilityRequest;
import com.cuckooy.ocpp.v20.model.availability.ChangeAvailabilityResponse;
import com.cuckooy.ocpp.v20.model.availability.HeartbeatRequest;
import com.cuckooy.ocpp.v20.model.availability.HeartbeatResponse;
import com.cuckooy.ocpp.v20.model.availability.NotifyEventRequest;
import com.cuckooy.ocpp.v20.model.availability.NotifyEventResponse;
import com.cuckooy.ocpp.v20.model.availability.StatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.availability.StatusNotificationResponse;
import com.cuckooy.ocpp.v20.model.cost.CostUpdatedRequest;
import com.cuckooy.ocpp.v20.model.cost.CostUpdatedResponse;
import com.cuckooy.ocpp.v20.model.datatransfer.DataTransferRequest;
import com.cuckooy.ocpp.v20.model.datatransfer.DataTransferResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.ClearVariableMonitoringRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.ClearVariableMonitoringResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.CustomerInformationRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.CustomerInformationResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.GetLogRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.GetLogResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.GetMonitoringReportRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.GetMonitoringReportResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.LogStatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.LogStatusNotificationResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.NotifyCustomerInformationRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.NotifyCustomerInformationResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.NotifyMonitoringReportRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.NotifyMonitoringReportResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.SetMonitoringBaseRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.SetMonitoringBaseResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.SetMonitoringLevelRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.SetMonitoringLevelResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.SetVariableMonitoringRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.SetVariableMonitoringResponse;
import com.cuckooy.ocpp.v20.model.displaymessage.ClearDisplayMessageRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.ClearDisplayMessageResponse;
import com.cuckooy.ocpp.v20.model.displaymessage.GetDisplayMessagesRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.GetDisplayMessagesResponse;
import com.cuckooy.ocpp.v20.model.displaymessage.NotifyDisplayMessagesRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.NotifyDisplayMessagesResponse;
import com.cuckooy.ocpp.v20.model.displaymessage.SetDisplayMessageRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.SetDisplayMessageResponse;
import com.cuckooy.ocpp.v20.model.firmware.FirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.firmware.FirmwareStatusNotificationResponse;
import com.cuckooy.ocpp.v20.model.firmware.PublishFirmwareRequest;
import com.cuckooy.ocpp.v20.model.firmware.PublishFirmwareResponse;
import com.cuckooy.ocpp.v20.model.firmware.PublishFirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.firmware.PublishFirmwareStatusNotificationResponse;
import com.cuckooy.ocpp.v20.model.firmware.UnpublishFirmwareRequest;
import com.cuckooy.ocpp.v20.model.firmware.UnpublishFirmwareResponse;
import com.cuckooy.ocpp.v20.model.firmware.UpdateFirmwareRequest;
import com.cuckooy.ocpp.v20.model.firmware.UpdateFirmwareResponse;
import com.cuckooy.ocpp.v20.model.iso15118.DeleteCertificateRequest;
import com.cuckooy.ocpp.v20.model.iso15118.DeleteCertificateResponse;
import com.cuckooy.ocpp.v20.model.iso15118.Get15118EVCertificateRequest;
import com.cuckooy.ocpp.v20.model.iso15118.Get15118EVCertificateResponse;
import com.cuckooy.ocpp.v20.model.iso15118.GetCertificateStatusRequest;
import com.cuckooy.ocpp.v20.model.iso15118.GetCertificateStatusResponse;
import com.cuckooy.ocpp.v20.model.iso15118.GetInstalledCertificateIdsRequest;
import com.cuckooy.ocpp.v20.model.iso15118.GetInstalledCertificateIdsResponse;
import com.cuckooy.ocpp.v20.model.iso15118.InstallCertificateRequest;
import com.cuckooy.ocpp.v20.model.iso15118.InstallCertificateResponse;
import com.cuckooy.ocpp.v20.model.localauth.GetLocalListVersionRequest;
import com.cuckooy.ocpp.v20.model.localauth.GetLocalListVersionResponse;
import com.cuckooy.ocpp.v20.model.localauth.SendLocalListRequest;
import com.cuckooy.ocpp.v20.model.localauth.SendLocalListResponse;
import com.cuckooy.ocpp.v20.model.metervalues.MeterValuesRequest;
import com.cuckooy.ocpp.v20.model.metervalues.MeterValuesResponse;
import com.cuckooy.ocpp.v20.model.provisioning.BootNotificationRequest;
import com.cuckooy.ocpp.v20.model.provisioning.BootNotificationResponse;
import com.cuckooy.ocpp.v20.model.provisioning.GetBaseReportRequest;
import com.cuckooy.ocpp.v20.model.provisioning.GetBaseReportResponse;
import com.cuckooy.ocpp.v20.model.provisioning.GetReportRequest;
import com.cuckooy.ocpp.v20.model.provisioning.GetReportResponse;
import com.cuckooy.ocpp.v20.model.provisioning.GetVariablesRequest;
import com.cuckooy.ocpp.v20.model.provisioning.GetVariablesResponse;
import com.cuckooy.ocpp.v20.model.provisioning.NotifyReportRequest;
import com.cuckooy.ocpp.v20.model.provisioning.NotifyReportResponse;
import com.cuckooy.ocpp.v20.model.provisioning.ResetRequest;
import com.cuckooy.ocpp.v20.model.provisioning.ResetResponse;
import com.cuckooy.ocpp.v20.model.provisioning.SetNetworkProfileRequest;
import com.cuckooy.ocpp.v20.model.provisioning.SetNetworkProfileResponse;
import com.cuckooy.ocpp.v20.model.provisioning.SetVariablesRequest;
import com.cuckooy.ocpp.v20.model.provisioning.SetVariablesResponse;
import com.cuckooy.ocpp.v20.model.remote.RequestStartTransactionRequest;
import com.cuckooy.ocpp.v20.model.remote.RequestStartTransactionResponse;
import com.cuckooy.ocpp.v20.model.remote.RequestStopTransactionRequest;
import com.cuckooy.ocpp.v20.model.remote.RequestStopTransactionResponse;
import com.cuckooy.ocpp.v20.model.remote.TriggerMessageRequest;
import com.cuckooy.ocpp.v20.model.remote.TriggerMessageResponse;
import com.cuckooy.ocpp.v20.model.remote.UnlockConnectorRequest;
import com.cuckooy.ocpp.v20.model.remote.UnlockConnectorResponse;
import com.cuckooy.ocpp.v20.model.reservation.CancelReservationRequest;
import com.cuckooy.ocpp.v20.model.reservation.CancelReservationResponse;
import com.cuckooy.ocpp.v20.model.reservation.ReservationStatusUpdateRequest;
import com.cuckooy.ocpp.v20.model.reservation.ReservationStatusUpdateResponse;
import com.cuckooy.ocpp.v20.model.reservation.ReserveNowRequest;
import com.cuckooy.ocpp.v20.model.reservation.ReserveNowResponse;
import com.cuckooy.ocpp.v20.model.security.CertificateSignedRequest;
import com.cuckooy.ocpp.v20.model.security.CertificateSignedResponse;
import com.cuckooy.ocpp.v20.model.security.SecurityEventNotificationRequest;
import com.cuckooy.ocpp.v20.model.security.SecurityEventNotificationResponse;
import com.cuckooy.ocpp.v20.model.security.SignCertificateRequest;
import com.cuckooy.ocpp.v20.model.security.SignCertificateResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.ClearChargingProfileRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.ClearChargingProfileResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.ClearedChargingLimitRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.ClearedChargingLimitResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.GetChargingProfilesRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.GetChargingProfilesResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.GetCompositeScheduleRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.GetCompositeScheduleResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyChargingLimitRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyChargingLimitResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyEVChargingNeedsRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyEVChargingNeedsResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyEVChargingScheduleRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyEVChargingScheduleResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.ReportChargingProfilesRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.ReportChargingProfilesResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.SetChargingProfileRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.SetChargingProfileResponse;
import com.cuckooy.ocpp.v20.model.transactions.GetTransactionStatusRequest;
import com.cuckooy.ocpp.v20.model.transactions.GetTransactionStatusResponse;
import com.cuckooy.ocpp.v20.model.transactions.TransactionEventRequest;
import com.cuckooy.ocpp.v20.model.transactions.TransactionEventResponse;
import lombok.Getter;

/**
 * The enum Ocpp 20 action.
 */
@Getter
public enum Ocpp20Action {

    /**
     * Authorize ocpp 20 action.
     */
    // core
    Authorize(AuthorizeRequest.class, AuthorizeResponse.class),
    /**
     * Clear cache ocpp 20 action.
     */
    ClearCache(ClearCacheRequest.class, ClearCacheResponse.class),
    /**
     * Change availability ocpp 20 action.
     */
    ChangeAvailability(ChangeAvailabilityRequest.class, ChangeAvailabilityResponse.class),
    /**
     * Heartbeat ocpp 20 action.
     */
    Heartbeat(HeartbeatRequest.class, HeartbeatResponse.class),
    /**
     * Notify event ocpp 20 action.
     */
    NotifyEvent(NotifyEventRequest.class, NotifyEventResponse.class),
    /**
     * Status notification ocpp 20 action.
     */
    StatusNotification(StatusNotificationRequest.class, StatusNotificationResponse.class),
    /**
     * Cost updated ocpp 20 action.
     */
    CostUpdated(CostUpdatedRequest.class, CostUpdatedResponse.class),
    /**
     * Data transfer ocpp 20 action.
     */
    DataTransfer(DataTransferRequest.class, DataTransferResponse.class),
    /**
     * Clear variable monitoring ocpp 20 action.
     */
    ClearVariableMonitoring(ClearVariableMonitoringRequest.class, ClearVariableMonitoringResponse.class),
    /**
     * Customer information ocpp 20 action.
     */
    CustomerInformation(CustomerInformationRequest.class, CustomerInformationResponse.class),
    /**
     * Get log ocpp 20 action.
     */
    GetLog(GetLogRequest.class, GetLogResponse.class),
    /**
     * Get monitoring report ocpp 20 action.
     */
    GetMonitoringReport(GetMonitoringReportRequest.class, GetMonitoringReportResponse.class),
    /**
     * Log status notification ocpp 20 action.
     */
    LogStatusNotification(LogStatusNotificationRequest.class, LogStatusNotificationResponse.class),
    /**
     * Notify customer information ocpp 20 action.
     */
    NotifyCustomerInformation(NotifyCustomerInformationRequest.class, NotifyCustomerInformationResponse.class),
    /**
     * Notify monitoring report ocpp 20 action.
     */
    NotifyMonitoringReport(NotifyMonitoringReportRequest.class, NotifyMonitoringReportResponse.class),
    /**
     * Set monitoring base ocpp 20 action.
     */
    SetMonitoringBase(SetMonitoringBaseRequest.class, SetMonitoringBaseResponse.class),
    /**
     * Set monitoring level ocpp 20 action.
     */
    SetMonitoringLevel(SetMonitoringLevelRequest.class, SetMonitoringLevelResponse.class),
    /**
     * Set variable monitoring ocpp 20 action.
     */
    SetVariableMonitoring(SetVariableMonitoringRequest.class, SetVariableMonitoringResponse.class),
    /**
     * Clear display message ocpp 20 action.
     */
    ClearDisplayMessage(ClearDisplayMessageRequest.class, ClearDisplayMessageResponse.class),
    /**
     * Get display messages ocpp 20 action.
     */
    GetDisplayMessages(GetDisplayMessagesRequest.class, GetDisplayMessagesResponse.class),
    /**
     * Notify display messages ocpp 20 action.
     */
    NotifyDisplayMessages(NotifyDisplayMessagesRequest.class, NotifyDisplayMessagesResponse.class),
    /**
     * Set display message ocpp 20 action.
     */
    SetDisplayMessage(SetDisplayMessageRequest.class, SetDisplayMessageResponse.class),
    /**
     * Firmware status notification ocpp 20 action.
     */
    FirmwareStatusNotification(FirmwareStatusNotificationRequest.class, FirmwareStatusNotificationResponse.class),
    /**
     * Publish firmware ocpp 20 action.
     */
    PublishFirmware(PublishFirmwareRequest.class, PublishFirmwareResponse.class),
    /**
     * Publish firmware status notification ocpp 20 action.
     */
    PublishFirmwareStatusNotification(PublishFirmwareStatusNotificationRequest.class,
        PublishFirmwareStatusNotificationResponse.class),
    /**
     * Unpublish firmware ocpp 20 action.
     */
    UnpublishFirmware(UnpublishFirmwareRequest.class, UnpublishFirmwareResponse.class),
    /**
     * Update firmware ocpp 20 action.
     */
    UpdateFirmware(UpdateFirmwareRequest.class, UpdateFirmwareResponse.class),
    /**
     * Delete certificate ocpp 20 action.
     */
    DeleteCertificate(DeleteCertificateRequest.class, DeleteCertificateResponse.class),
    /**
     * Get 15118 ev certificate ocpp 20 action.
     */
    Get15118EVCertificate(Get15118EVCertificateRequest.class, Get15118EVCertificateResponse.class),
    /**
     * Get certificate status ocpp 20 action.
     */
    GetCertificateStatus(GetCertificateStatusRequest.class, GetCertificateStatusResponse.class),
    /**
     * Get installed certificate ids ocpp 20 action.
     */
    GetInstalledCertificateIds(GetInstalledCertificateIdsRequest.class, GetInstalledCertificateIdsResponse.class),
    /**
     * Install certificate ocpp 20 action.
     */
    InstallCertificate(InstallCertificateRequest.class, InstallCertificateResponse.class),
    /**
     * Get local list version ocpp 20 action.
     */
    GetLocalListVersion(GetLocalListVersionRequest.class, GetLocalListVersionResponse.class),
    /**
     * Send local list ocpp 20 action.
     */
    SendLocalList(SendLocalListRequest.class, SendLocalListResponse.class),
    /**
     * Meter values ocpp 20 action.
     */
    MeterValues(MeterValuesRequest.class, MeterValuesResponse.class),
    /**
     * Boot notification ocpp 20 action.
     */
    BootNotification(BootNotificationRequest.class, BootNotificationResponse.class),
    /**
     * Get base report ocpp 20 action.
     */
    GetBaseReport(GetBaseReportRequest.class, GetBaseReportResponse.class),
    /**
     * Get report ocpp 20 action.
     */
    GetReport(GetReportRequest.class, GetReportResponse.class),
    /**
     * Get variables ocpp 20 action.
     */
    GetVariables(GetVariablesRequest.class, GetVariablesResponse.class),
    /**
     * Notify report ocpp 20 action.
     */
    NotifyReport(NotifyReportRequest.class, NotifyReportResponse.class),
    /**
     * Reset ocpp 20 action.
     */
    Reset(ResetRequest.class, ResetResponse.class),
    /**
     * Set network profile ocpp 20 action.
     */
    SetNetworkProfile(SetNetworkProfileRequest.class, SetNetworkProfileResponse.class),
    /**
     * Set variables ocpp 20 action.
     */
    SetVariables(SetVariablesRequest.class, SetVariablesResponse.class),
    /**
     * Request start transaction ocpp 20 action.
     */
    RequestStartTransaction(RequestStartTransactionRequest.class, RequestStartTransactionResponse.class),
    /**
     * Request stop transaction ocpp 20 action.
     */
    RequestStopTransaction(RequestStopTransactionRequest.class, RequestStopTransactionResponse.class),
    /**
     * Trigger message ocpp 20 action.
     */
    TriggerMessage(TriggerMessageRequest.class, TriggerMessageResponse.class),
    /**
     * Unlock connector ocpp 20 action.
     */
    UnlockConnector(UnlockConnectorRequest.class, UnlockConnectorResponse.class),
    /**
     * Cancel reservation ocpp 20 action.
     */
    CancelReservation(CancelReservationRequest.class, CancelReservationResponse.class),
    /**
     * Reservation status update ocpp 20 action.
     */
    ReservationStatusUpdate(ReservationStatusUpdateRequest.class, ReservationStatusUpdateResponse.class),
    /**
     * Reserve now ocpp 20 action.
     */
    ReserveNow(ReserveNowRequest.class, ReserveNowResponse.class),
    /**
     * Certificate signed ocpp 20 action.
     */
    CertificateSigned(CertificateSignedRequest.class, CertificateSignedResponse.class),
    /**
     * Security event notification ocpp 20 action.
     */
    SecurityEventNotification(SecurityEventNotificationRequest.class, SecurityEventNotificationResponse.class),
    /**
     * Sign certificate ocpp 20 action.
     */
    SignCertificate(SignCertificateRequest.class, SignCertificateResponse.class),
    /**
     * Clear charging profile ocpp 20 action.
     */
    ClearChargingProfile(ClearChargingProfileRequest.class, ClearChargingProfileResponse.class),
    /**
     * Cleared charging limit ocpp 20 action.
     */
    ClearedChargingLimit(ClearedChargingLimitRequest.class, ClearedChargingLimitResponse.class),
    /**
     * Get charging profiles ocpp 20 action.
     */
    GetChargingProfiles(GetChargingProfilesRequest.class, GetChargingProfilesResponse.class),
    /**
     * Get composite schedule ocpp 20 action.
     */
    GetCompositeSchedule(GetCompositeScheduleRequest.class, GetCompositeScheduleResponse.class),
    /**
     * Notify charging limit ocpp 20 action.
     */
    NotifyChargingLimit(NotifyChargingLimitRequest.class, NotifyChargingLimitResponse.class),
    /**
     * Notify ev charging needs ocpp 20 action.
     */
    NotifyEVChargingNeeds(NotifyEVChargingNeedsRequest.class, NotifyEVChargingNeedsResponse.class),
    /**
     * Notify ev charging schedule ocpp 20 action.
     */
    NotifyEVChargingSchedule(NotifyEVChargingScheduleRequest.class, NotifyEVChargingScheduleResponse.class),
    /**
     * Report charging profiles ocpp 20 action.
     */
    ReportChargingProfiles(ReportChargingProfilesRequest.class, ReportChargingProfilesResponse.class),
    /**
     * Set charging profile ocpp 20 action.
     */
    SetChargingProfile(SetChargingProfileRequest.class, SetChargingProfileResponse.class),
    /**
     * Get transaction status ocpp 20 action.
     */
    GetTransactionStatus(GetTransactionStatusRequest.class, GetTransactionStatusResponse.class),
    /**
     * Transaction event ocpp 20 action.
     */
    TransactionEvent(TransactionEventRequest.class, TransactionEventResponse.class),
    ;

    private final Class<? extends Request> requestClass;
    private final Class<? extends Response> responseClass;

    Ocpp20Action(Class<? extends Request> requestClass, Class<? extends Response> responseClass) {
        this.requestClass = requestClass;
        this.responseClass = responseClass;
    }
}
