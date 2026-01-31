package com.cuckooy.ocpp.v21.model;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.authorization.AuthorizeRequest;
import com.cuckooy.ocpp.v21.model.authorization.AuthorizeResponse;
import com.cuckooy.ocpp.v21.model.authorization.ClearCacheRequest;
import com.cuckooy.ocpp.v21.model.authorization.ClearCacheResponse;
import com.cuckooy.ocpp.v21.model.availability.ChangeAvailabilityRequest;
import com.cuckooy.ocpp.v21.model.availability.ChangeAvailabilityResponse;
import com.cuckooy.ocpp.v21.model.availability.HeartbeatRequest;
import com.cuckooy.ocpp.v21.model.availability.HeartbeatResponse;
import com.cuckooy.ocpp.v21.model.availability.NotifyEventRequest;
import com.cuckooy.ocpp.v21.model.availability.NotifyEventResponse;
import com.cuckooy.ocpp.v21.model.availability.StatusNotificationRequest;
import com.cuckooy.ocpp.v21.model.availability.StatusNotificationResponse;
import com.cuckooy.ocpp.v21.model.cost.CostUpdatedRequest;
import com.cuckooy.ocpp.v21.model.cost.CostUpdatedResponse;
import com.cuckooy.ocpp.v21.model.datatransfer.DataTransferRequest;
import com.cuckooy.ocpp.v21.model.datatransfer.DataTransferResponse;
import com.cuckooy.ocpp.v21.model.diagnostics.ClearVariableMonitoringRequest;
import com.cuckooy.ocpp.v21.model.diagnostics.ClearVariableMonitoringResponse;
import com.cuckooy.ocpp.v21.model.diagnostics.CustomerInformationRequest;
import com.cuckooy.ocpp.v21.model.diagnostics.CustomerInformationResponse;
import com.cuckooy.ocpp.v21.model.diagnostics.GetLogRequest;
import com.cuckooy.ocpp.v21.model.diagnostics.GetLogResponse;
import com.cuckooy.ocpp.v21.model.diagnostics.GetMonitoringReportRequest;
import com.cuckooy.ocpp.v21.model.diagnostics.GetMonitoringReportResponse;
import com.cuckooy.ocpp.v21.model.diagnostics.LogStatusNotificationRequest;
import com.cuckooy.ocpp.v21.model.diagnostics.LogStatusNotificationResponse;
import com.cuckooy.ocpp.v21.model.diagnostics.NotifyCustomerInformationRequest;
import com.cuckooy.ocpp.v21.model.diagnostics.NotifyCustomerInformationResponse;
import com.cuckooy.ocpp.v21.model.diagnostics.NotifyMonitoringReportRequest;
import com.cuckooy.ocpp.v21.model.diagnostics.NotifyMonitoringReportResponse;
import com.cuckooy.ocpp.v21.model.diagnostics.SetMonitoringBaseRequest;
import com.cuckooy.ocpp.v21.model.diagnostics.SetMonitoringBaseResponse;
import com.cuckooy.ocpp.v21.model.diagnostics.SetMonitoringLevelRequest;
import com.cuckooy.ocpp.v21.model.diagnostics.SetMonitoringLevelResponse;
import com.cuckooy.ocpp.v21.model.diagnostics.SetVariableMonitoringRequest;
import com.cuckooy.ocpp.v21.model.diagnostics.SetVariableMonitoringResponse;
import com.cuckooy.ocpp.v21.model.displaymessage.ClearDisplayMessageRequest;
import com.cuckooy.ocpp.v21.model.displaymessage.ClearDisplayMessageResponse;
import com.cuckooy.ocpp.v21.model.displaymessage.GetDisplayMessagesRequest;
import com.cuckooy.ocpp.v21.model.displaymessage.GetDisplayMessagesResponse;
import com.cuckooy.ocpp.v21.model.displaymessage.NotifyDisplayMessagesRequest;
import com.cuckooy.ocpp.v21.model.displaymessage.NotifyDisplayMessagesResponse;
import com.cuckooy.ocpp.v21.model.displaymessage.SetDisplayMessageRequest;
import com.cuckooy.ocpp.v21.model.displaymessage.SetDisplayMessageResponse;
import com.cuckooy.ocpp.v21.model.firmware.FirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v21.model.firmware.FirmwareStatusNotificationResponse;
import com.cuckooy.ocpp.v21.model.firmware.PublishFirmwareRequest;
import com.cuckooy.ocpp.v21.model.firmware.PublishFirmwareResponse;
import com.cuckooy.ocpp.v21.model.firmware.PublishFirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v21.model.firmware.PublishFirmwareStatusNotificationResponse;
import com.cuckooy.ocpp.v21.model.firmware.UnpublishFirmwareRequest;
import com.cuckooy.ocpp.v21.model.firmware.UnpublishFirmwareResponse;
import com.cuckooy.ocpp.v21.model.firmware.UpdateFirmwareRequest;
import com.cuckooy.ocpp.v21.model.firmware.UpdateFirmwareResponse;
import com.cuckooy.ocpp.v21.model.iso15118.DeleteCertificateRequest;
import com.cuckooy.ocpp.v21.model.iso15118.DeleteCertificateResponse;
import com.cuckooy.ocpp.v21.model.iso15118.Get15118EVCertificateRequest;
import com.cuckooy.ocpp.v21.model.iso15118.Get15118EVCertificateResponse;
import com.cuckooy.ocpp.v21.model.iso15118.GetCertificateStatusRequest;
import com.cuckooy.ocpp.v21.model.iso15118.GetCertificateStatusResponse;
import com.cuckooy.ocpp.v21.model.iso15118.GetInstalledCertificateIdsRequest;
import com.cuckooy.ocpp.v21.model.iso15118.GetInstalledCertificateIdsResponse;
import com.cuckooy.ocpp.v21.model.iso15118.InstallCertificateRequest;
import com.cuckooy.ocpp.v21.model.iso15118.InstallCertificateResponse;
import com.cuckooy.ocpp.v21.model.localauth.GetLocalListVersionRequest;
import com.cuckooy.ocpp.v21.model.localauth.GetLocalListVersionResponse;
import com.cuckooy.ocpp.v21.model.localauth.SendLocalListRequest;
import com.cuckooy.ocpp.v21.model.localauth.SendLocalListResponse;
import com.cuckooy.ocpp.v21.model.metervalues.MeterValuesRequest;
import com.cuckooy.ocpp.v21.model.metervalues.MeterValuesResponse;
import com.cuckooy.ocpp.v21.model.provisioning.BootNotificationRequest;
import com.cuckooy.ocpp.v21.model.provisioning.BootNotificationResponse;
import com.cuckooy.ocpp.v21.model.provisioning.GetBaseReportRequest;
import com.cuckooy.ocpp.v21.model.provisioning.GetBaseReportResponse;
import com.cuckooy.ocpp.v21.model.provisioning.GetReportRequest;
import com.cuckooy.ocpp.v21.model.provisioning.GetReportResponse;
import com.cuckooy.ocpp.v21.model.provisioning.GetVariablesRequest;
import com.cuckooy.ocpp.v21.model.provisioning.GetVariablesResponse;
import com.cuckooy.ocpp.v21.model.provisioning.NotifyReportRequest;
import com.cuckooy.ocpp.v21.model.provisioning.NotifyReportResponse;
import com.cuckooy.ocpp.v21.model.provisioning.ResetRequest;
import com.cuckooy.ocpp.v21.model.provisioning.ResetResponse;
import com.cuckooy.ocpp.v21.model.provisioning.SetNetworkProfileRequest;
import com.cuckooy.ocpp.v21.model.provisioning.SetNetworkProfileResponse;
import com.cuckooy.ocpp.v21.model.provisioning.SetVariablesRequest;
import com.cuckooy.ocpp.v21.model.provisioning.SetVariablesResponse;
import com.cuckooy.ocpp.v21.model.remote.RequestStartTransactionRequest;
import com.cuckooy.ocpp.v21.model.remote.RequestStartTransactionResponse;
import com.cuckooy.ocpp.v21.model.remote.RequestStopTransactionRequest;
import com.cuckooy.ocpp.v21.model.remote.RequestStopTransactionResponse;
import com.cuckooy.ocpp.v21.model.remote.TriggerMessageRequest;
import com.cuckooy.ocpp.v21.model.remote.TriggerMessageResponse;
import com.cuckooy.ocpp.v21.model.remote.UnlockConnectorRequest;
import com.cuckooy.ocpp.v21.model.remote.UnlockConnectorResponse;
import com.cuckooy.ocpp.v21.model.reservation.CancelReservationRequest;
import com.cuckooy.ocpp.v21.model.reservation.CancelReservationResponse;
import com.cuckooy.ocpp.v21.model.reservation.ReservationStatusUpdateRequest;
import com.cuckooy.ocpp.v21.model.reservation.ReservationStatusUpdateResponse;
import com.cuckooy.ocpp.v21.model.reservation.ReserveNowRequest;
import com.cuckooy.ocpp.v21.model.reservation.ReserveNowResponse;
import com.cuckooy.ocpp.v21.model.security.CertificateSignedRequest;
import com.cuckooy.ocpp.v21.model.security.CertificateSignedResponse;
import com.cuckooy.ocpp.v21.model.security.SecurityEventNotificationRequest;
import com.cuckooy.ocpp.v21.model.security.SecurityEventNotificationResponse;
import com.cuckooy.ocpp.v21.model.security.SignCertificateRequest;
import com.cuckooy.ocpp.v21.model.security.SignCertificateResponse;
import com.cuckooy.ocpp.v21.model.smartcharging.ClearChargingProfileRequest;
import com.cuckooy.ocpp.v21.model.smartcharging.ClearChargingProfileResponse;
import com.cuckooy.ocpp.v21.model.smartcharging.ClearedChargingLimitRequest;
import com.cuckooy.ocpp.v21.model.smartcharging.ClearedChargingLimitResponse;
import com.cuckooy.ocpp.v21.model.smartcharging.GetChargingProfilesRequest;
import com.cuckooy.ocpp.v21.model.smartcharging.GetChargingProfilesResponse;
import com.cuckooy.ocpp.v21.model.smartcharging.GetCompositeScheduleRequest;
import com.cuckooy.ocpp.v21.model.smartcharging.GetCompositeScheduleResponse;
import com.cuckooy.ocpp.v21.model.smartcharging.NotifyChargingLimitRequest;
import com.cuckooy.ocpp.v21.model.smartcharging.NotifyChargingLimitResponse;
import com.cuckooy.ocpp.v21.model.smartcharging.NotifyEVChargingNeedsRequest;
import com.cuckooy.ocpp.v21.model.smartcharging.NotifyEVChargingNeedsResponse;
import com.cuckooy.ocpp.v21.model.smartcharging.NotifyEVChargingScheduleRequest;
import com.cuckooy.ocpp.v21.model.smartcharging.NotifyEVChargingScheduleResponse;
import com.cuckooy.ocpp.v21.model.smartcharging.ReportChargingProfilesRequest;
import com.cuckooy.ocpp.v21.model.smartcharging.ReportChargingProfilesResponse;
import com.cuckooy.ocpp.v21.model.smartcharging.SetChargingProfileRequest;
import com.cuckooy.ocpp.v21.model.smartcharging.SetChargingProfileResponse;
import com.cuckooy.ocpp.v21.model.transactions.GetTransactionStatusRequest;
import com.cuckooy.ocpp.v21.model.transactions.GetTransactionStatusResponse;
import com.cuckooy.ocpp.v21.model.transactions.TransactionEventRequest;
import com.cuckooy.ocpp.v21.model.transactions.TransactionEventResponse;
import lombok.Getter;

/**
 * The enum Ocpp 21 action.
 */
@Getter
public enum Ocpp21Action {

    /**
     * Authorize ocpp 21 action.
     */
    // core
    Authorize(AuthorizeRequest.class, AuthorizeResponse.class),
    /**
     * Clear cache ocpp 21 action.
     */
    ClearCache(ClearCacheRequest.class, ClearCacheResponse.class),
    /**
     * Change availability ocpp 21 action.
     */
    ChangeAvailability(ChangeAvailabilityRequest.class, ChangeAvailabilityResponse.class),
    /**
     * Heartbeat ocpp 21 action.
     */
    Heartbeat(HeartbeatRequest.class, HeartbeatResponse.class),
    /**
     * Notify event ocpp 21 action.
     */
    NotifyEvent(NotifyEventRequest.class, NotifyEventResponse.class),
    /**
     * Status notification ocpp 21 action.
     */
    StatusNotification(StatusNotificationRequest.class, StatusNotificationResponse.class),
    /**
     * Cost updated ocpp 21 action.
     */
    CostUpdated(CostUpdatedRequest.class, CostUpdatedResponse.class),
    /**
     * Data transfer ocpp 21 action.
     */
    DataTransfer(DataTransferRequest.class, DataTransferResponse.class),
    /**
     * Clear variable monitoring ocpp 21 action.
     */
    ClearVariableMonitoring(ClearVariableMonitoringRequest.class, ClearVariableMonitoringResponse.class),
    /**
     * Customer information ocpp 21 action.
     */
    CustomerInformation(CustomerInformationRequest.class, CustomerInformationResponse.class),
    /**
     * Get log ocpp 21 action.
     */
    GetLog(GetLogRequest.class, GetLogResponse.class),
    /**
     * Get monitoring report ocpp 21 action.
     */
    GetMonitoringReport(GetMonitoringReportRequest.class, GetMonitoringReportResponse.class),
    /**
     * Log status notification ocpp 21 action.
     */
    LogStatusNotification(LogStatusNotificationRequest.class, LogStatusNotificationResponse.class),
    /**
     * Notify customer information ocpp 21 action.
     */
    NotifyCustomerInformation(NotifyCustomerInformationRequest.class, NotifyCustomerInformationResponse.class),
    /**
     * Notify monitoring report ocpp 21 action.
     */
    NotifyMonitoringReport(NotifyMonitoringReportRequest.class, NotifyMonitoringReportResponse.class),
    /**
     * Set monitoring base ocpp 21 action.
     */
    SetMonitoringBase(SetMonitoringBaseRequest.class, SetMonitoringBaseResponse.class),
    /**
     * Set monitoring level ocpp 21 action.
     */
    SetMonitoringLevel(SetMonitoringLevelRequest.class, SetMonitoringLevelResponse.class),
    /**
     * Set variable monitoring ocpp 21 action.
     */
    SetVariableMonitoring(SetVariableMonitoringRequest.class, SetVariableMonitoringResponse.class),
    /**
     * Clear display message ocpp 21 action.
     */
    ClearDisplayMessage(ClearDisplayMessageRequest.class, ClearDisplayMessageResponse.class),
    /**
     * Get display messages ocpp 21 action.
     */
    GetDisplayMessages(GetDisplayMessagesRequest.class, GetDisplayMessagesResponse.class),
    /**
     * Notify display messages ocpp 21 action.
     */
    NotifyDisplayMessages(NotifyDisplayMessagesRequest.class, NotifyDisplayMessagesResponse.class),
    /**
     * Set display message ocpp 21 action.
     */
    SetDisplayMessage(SetDisplayMessageRequest.class, SetDisplayMessageResponse.class),
    /**
     * Firmware status notification ocpp 21 action.
     */
    FirmwareStatusNotification(FirmwareStatusNotificationRequest.class, FirmwareStatusNotificationResponse.class),
    /**
     * Publish firmware ocpp 21 action.
     */
    PublishFirmware(PublishFirmwareRequest.class, PublishFirmwareResponse.class),
    /**
     * Publish firmware status notification ocpp 21 action.
     */
    PublishFirmwareStatusNotification(PublishFirmwareStatusNotificationRequest.class,
        PublishFirmwareStatusNotificationResponse.class),
    /**
     * Unpublish firmware ocpp 21 action.
     */
    UnpublishFirmware(UnpublishFirmwareRequest.class, UnpublishFirmwareResponse.class),
    /**
     * Update firmware ocpp 21 action.
     */
    UpdateFirmware(UpdateFirmwareRequest.class, UpdateFirmwareResponse.class),
    /**
     * Delete certificate ocpp 21 action.
     */
    DeleteCertificate(DeleteCertificateRequest.class, DeleteCertificateResponse.class),
    /**
     * Get 15118 ev certificate ocpp 21 action.
     */
    Get15118EVCertificate(Get15118EVCertificateRequest.class, Get15118EVCertificateResponse.class),
    /**
     * Get certificate status ocpp 21 action.
     */
    GetCertificateStatus(GetCertificateStatusRequest.class, GetCertificateStatusResponse.class),
    /**
     * Get installed certificate ids ocpp 21 action.
     */
    GetInstalledCertificateIds(GetInstalledCertificateIdsRequest.class, GetInstalledCertificateIdsResponse.class),
    /**
     * Install certificate ocpp 21 action.
     */
    InstallCertificate(InstallCertificateRequest.class, InstallCertificateResponse.class),
    /**
     * Get local list version ocpp 21 action.
     */
    GetLocalListVersion(GetLocalListVersionRequest.class, GetLocalListVersionResponse.class),
    /**
     * Send local list ocpp 21 action.
     */
    SendLocalList(SendLocalListRequest.class, SendLocalListResponse.class),
    /**
     * Meter values ocpp 21 action.
     */
    MeterValues(MeterValuesRequest.class, MeterValuesResponse.class),
    /**
     * Boot notification ocpp 21 action.
     */
    BootNotification(BootNotificationRequest.class, BootNotificationResponse.class),
    /**
     * Get base report ocpp 21 action.
     */
    GetBaseReport(GetBaseReportRequest.class, GetBaseReportResponse.class),
    /**
     * Get report ocpp 21 action.
     */
    GetReport(GetReportRequest.class, GetReportResponse.class),
    /**
     * Get variables ocpp 21 action.
     */
    GetVariables(GetVariablesRequest.class, GetVariablesResponse.class),
    /**
     * Notify report ocpp 21 action.
     */
    NotifyReport(NotifyReportRequest.class, NotifyReportResponse.class),
    /**
     * Reset ocpp 21 action.
     */
    Reset(ResetRequest.class, ResetResponse.class),
    /**
     * Set network profile ocpp 21 action.
     */
    SetNetworkProfile(SetNetworkProfileRequest.class, SetNetworkProfileResponse.class),
    /**
     * Set variables ocpp 21 action.
     */
    SetVariables(SetVariablesRequest.class, SetVariablesResponse.class),
    /**
     * Request start transaction ocpp 21 action.
     */
    RequestStartTransaction(RequestStartTransactionRequest.class, RequestStartTransactionResponse.class),
    /**
     * Request stop transaction ocpp 21 action.
     */
    RequestStopTransaction(RequestStopTransactionRequest.class, RequestStopTransactionResponse.class),
    /**
     * Trigger message ocpp 21 action.
     */
    TriggerMessage(TriggerMessageRequest.class, TriggerMessageResponse.class),
    /**
     * Unlock connector ocpp 21 action.
     */
    UnlockConnector(UnlockConnectorRequest.class, UnlockConnectorResponse.class),
    /**
     * Cancel reservation ocpp 21 action.
     */
    CancelReservation(CancelReservationRequest.class, CancelReservationResponse.class),
    /**
     * Reservation status update ocpp 21 action.
     */
    ReservationStatusUpdate(ReservationStatusUpdateRequest.class, ReservationStatusUpdateResponse.class),
    /**
     * Reserve now ocpp 21 action.
     */
    ReserveNow(ReserveNowRequest.class, ReserveNowResponse.class),
    /**
     * Certificate signed ocpp 21 action.
     */
    CertificateSigned(CertificateSignedRequest.class, CertificateSignedResponse.class),
    /**
     * Security event notification ocpp 21 action.
     */
    SecurityEventNotification(SecurityEventNotificationRequest.class, SecurityEventNotificationResponse.class),
    /**
     * Sign certificate ocpp 21 action.
     */
    SignCertificate(SignCertificateRequest.class, SignCertificateResponse.class),
    /**
     * Clear charging profile ocpp 21 action.
     */
    ClearChargingProfile(ClearChargingProfileRequest.class, ClearChargingProfileResponse.class),
    /**
     * Cleared charging limit ocpp 21 action.
     */
    ClearedChargingLimit(ClearedChargingLimitRequest.class, ClearedChargingLimitResponse.class),
    /**
     * Get charging profiles ocpp 21 action.
     */
    GetChargingProfiles(GetChargingProfilesRequest.class, GetChargingProfilesResponse.class),
    /**
     * Get composite schedule ocpp 21 action.
     */
    GetCompositeSchedule(GetCompositeScheduleRequest.class, GetCompositeScheduleResponse.class),
    /**
     * Notify charging limit ocpp 21 action.
     */
    NotifyChargingLimit(NotifyChargingLimitRequest.class, NotifyChargingLimitResponse.class),
    /**
     * Notify ev charging needs ocpp 21 action.
     */
    NotifyEVChargingNeeds(NotifyEVChargingNeedsRequest.class, NotifyEVChargingNeedsResponse.class),
    /**
     * Notify ev charging schedule ocpp 21 action.
     */
    NotifyEVChargingSchedule(NotifyEVChargingScheduleRequest.class, NotifyEVChargingScheduleResponse.class),
    /**
     * Report charging profiles ocpp 21 action.
     */
    ReportChargingProfiles(ReportChargingProfilesRequest.class, ReportChargingProfilesResponse.class),
    /**
     * Set charging profile ocpp 21 action.
     */
    SetChargingProfile(SetChargingProfileRequest.class, SetChargingProfileResponse.class),
    /**
     * Get transaction status ocpp 21 action.
     */
    GetTransactionStatus(GetTransactionStatusRequest.class, GetTransactionStatusResponse.class),
    /**
     * Transaction event ocpp 21 action.
     */
    TransactionEvent(TransactionEventRequest.class, TransactionEventResponse.class),
    ;

    private final Class<? extends Request> requestClass;
    private final Class<? extends Response> responseClass;

    Ocpp21Action(Class<? extends Request> requestClass, Class<? extends Response> responseClass) {
        this.requestClass = requestClass;
        this.responseClass = responseClass;
    }
}
