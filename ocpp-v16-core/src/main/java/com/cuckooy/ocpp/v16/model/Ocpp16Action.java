package com.cuckooy.ocpp.v16.model;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v16.model.core.AuthorizeRequest;
import com.cuckooy.ocpp.v16.model.core.AuthorizeResponse;
import com.cuckooy.ocpp.v16.model.core.BootNotificationRequest;
import com.cuckooy.ocpp.v16.model.core.BootNotificationResponse;
import com.cuckooy.ocpp.v16.model.core.ChangeAvailabilityRequest;
import com.cuckooy.ocpp.v16.model.core.ChangeAvailabilityResponse;
import com.cuckooy.ocpp.v16.model.core.ChangeConfigurationRequest;
import com.cuckooy.ocpp.v16.model.core.ChangeConfigurationResponse;
import com.cuckooy.ocpp.v16.model.core.ClearCacheRequest;
import com.cuckooy.ocpp.v16.model.core.ClearCacheResponse;
import com.cuckooy.ocpp.v16.model.core.DataTransferRequest;
import com.cuckooy.ocpp.v16.model.core.DataTransferResponse;
import com.cuckooy.ocpp.v16.model.core.GetConfigurationRequest;
import com.cuckooy.ocpp.v16.model.core.GetConfigurationResponse;
import com.cuckooy.ocpp.v16.model.core.HeartbeatRequest;
import com.cuckooy.ocpp.v16.model.core.HeartbeatResponse;
import com.cuckooy.ocpp.v16.model.core.MeterValuesRequest;
import com.cuckooy.ocpp.v16.model.core.MeterValuesResponse;
import com.cuckooy.ocpp.v16.model.core.RemoteStartTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.RemoteStartTransactionResponse;
import com.cuckooy.ocpp.v16.model.core.RemoteStopTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.RemoteStopTransactionResponse;
import com.cuckooy.ocpp.v16.model.core.ResetRequest;
import com.cuckooy.ocpp.v16.model.core.ResetResponse;
import com.cuckooy.ocpp.v16.model.core.StartTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.StartTransactionResponse;
import com.cuckooy.ocpp.v16.model.core.StatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.core.StatusNotificationResponse;
import com.cuckooy.ocpp.v16.model.core.StopTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.StopTransactionResponse;
import com.cuckooy.ocpp.v16.model.core.UnlockConnectorRequest;
import com.cuckooy.ocpp.v16.model.core.UnlockConnectorResponse;
import com.cuckooy.ocpp.v16.model.firmware.DiagnosticsStatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.firmware.DiagnosticsStatusNotificationResponse;
import com.cuckooy.ocpp.v16.model.firmware.FirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.firmware.FirmwareStatusNotificationResponse;
import com.cuckooy.ocpp.v16.model.firmware.GetDiagnosticsRequest;
import com.cuckooy.ocpp.v16.model.firmware.GetDiagnosticsResponse;
import com.cuckooy.ocpp.v16.model.firmware.UpdateFirmwareRequest;
import com.cuckooy.ocpp.v16.model.firmware.UpdateFirmwareResponse;
import com.cuckooy.ocpp.v16.model.localauthlist.GetLocalListVersionRequest;
import com.cuckooy.ocpp.v16.model.localauthlist.GetLocalListVersionResponse;
import com.cuckooy.ocpp.v16.model.localauthlist.SendLocalListRequest;
import com.cuckooy.ocpp.v16.model.localauthlist.SendLocalListResponse;
import com.cuckooy.ocpp.v16.model.remotetrigger.TriggerMessageRequest;
import com.cuckooy.ocpp.v16.model.remotetrigger.TriggerMessageResponse;
import com.cuckooy.ocpp.v16.model.reservation.CancelReservationRequest;
import com.cuckooy.ocpp.v16.model.reservation.CancelReservationResponse;
import com.cuckooy.ocpp.v16.model.reservation.ReserveNowRequest;
import com.cuckooy.ocpp.v16.model.reservation.ReserveNowResponse;
import com.cuckooy.ocpp.v16.model.smartcharging.ClearChargingProfileRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.ClearChargingProfileResponse;
import com.cuckooy.ocpp.v16.model.smartcharging.GetCompositeScheduleRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.GetCompositeScheduleResponse;
import com.cuckooy.ocpp.v16.model.smartcharging.SetChargingProfileRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.SetChargingProfileResponse;
import lombok.Getter;

/**
 * The enum Ocpp 16 action.
 */
@Getter
public enum Ocpp16Action {

    /**
     * Authorize ocpp 16 action.
     */
    // core
    Authorize(AuthorizeRequest.class, AuthorizeResponse.class),
    /**
     * Boot notification ocpp 16 action.
     */
    BootNotification(BootNotificationRequest.class, BootNotificationResponse.class),
    /**
     * Change availability ocpp 16 action.
     */
    ChangeAvailability(ChangeAvailabilityRequest.class, ChangeAvailabilityResponse.class),
    /**
     * Change configuration ocpp 16 action.
     */
    ChangeConfiguration(ChangeConfigurationRequest.class, ChangeConfigurationResponse.class),
    /**
     * Clear cache ocpp 16 action.
     */
    ClearCache(ClearCacheRequest.class, ClearCacheResponse.class),
    /**
     * Data transfer ocpp 16 action.
     */
    DataTransfer(DataTransferRequest.class, DataTransferResponse.class),
    /**
     * Get configuration ocpp 16 action.
     */
    GetConfiguration(GetConfigurationRequest.class, GetConfigurationResponse.class),
    /**
     * Heartbeat ocpp 16 action.
     */
    Heartbeat(HeartbeatRequest.class, HeartbeatResponse.class),
    /**
     * Meter values ocpp 16 action.
     */
    MeterValues(MeterValuesRequest.class, MeterValuesResponse.class),
    /**
     * Remote start transaction ocpp 16 action.
     */
    RemoteStartTransaction(RemoteStartTransactionRequest.class, RemoteStartTransactionResponse.class),
    /**
     * Remote stop transaction ocpp 16 action.
     */
    RemoteStopTransaction(RemoteStopTransactionRequest.class, RemoteStopTransactionResponse.class),
    /**
     * Reset ocpp 16 action.
     */
    Reset(ResetRequest.class, ResetResponse.class),
    /**
     * Start transaction ocpp 16 action.
     */
    StartTransaction(StartTransactionRequest.class, StartTransactionResponse.class),
    /**
     * Status notification ocpp 16 action.
     */
    StatusNotification(StatusNotificationRequest.class, StatusNotificationResponse.class),
    /**
     * Stop transaction ocpp 16 action.
     */
    StopTransaction(StopTransactionRequest.class, StopTransactionResponse.class),
    /**
     * Unlock connector ocpp 16 action.
     */
    UnlockConnector(UnlockConnectorRequest.class, UnlockConnectorResponse.class),
    /**
     * Diagnostics status notification ocpp 16 action.
     */
    // firmware
    DiagnosticsStatusNotification(DiagnosticsStatusNotificationRequest.class,
        DiagnosticsStatusNotificationResponse.class),
    /**
     * Firmware status notification ocpp 16 action.
     */
    FirmwareStatusNotification(FirmwareStatusNotificationRequest.class, FirmwareStatusNotificationResponse.class),
    /**
     * Get diagnostics ocpp 16 action.
     */
    GetDiagnostics(GetDiagnosticsRequest.class, GetDiagnosticsResponse.class),
    /**
     * Update firmware ocpp 16 action.
     */
    UpdateFirmware(UpdateFirmwareRequest.class, UpdateFirmwareResponse.class),
    /**
     * The Get local list version.
     */
    // local auth list
    GetLocalListVersion(GetLocalListVersionRequest.class, GetLocalListVersionResponse.class),
    /**
     * Send local list ocpp 16 action.
     */
    SendLocalList(SendLocalListRequest.class, SendLocalListResponse.class),
    /**
     * The Trigger message.
     */
    // local auth list
    TriggerMessage(TriggerMessageRequest.class, TriggerMessageResponse.class),
    /**
     * Cancel reservation ocpp 16 action.
     */
    // reservation
    CancelReservation(CancelReservationRequest.class, CancelReservationResponse.class),
    /**
     * Reserve now ocpp 16 action.
     */
    ReserveNow(ReserveNowRequest.class, ReserveNowResponse.class),
    /**
     * Clear charging profile ocpp 16 action.
     */
    // reservation
    ClearChargingProfile(ClearChargingProfileRequest.class, ClearChargingProfileResponse.class),
    /**
     * Get composite schedule ocpp 16 action.
     */
    GetCompositeSchedule(GetCompositeScheduleRequest.class, GetCompositeScheduleResponse.class),
    /**
     * Set charging profile ocpp 16 action.
     */
    SetChargingProfile(SetChargingProfileRequest.class, SetChargingProfileResponse.class),
    ;

    private final Class<? extends Request> requestClass;
    private final Class<? extends Response> responseClass;

    Ocpp16Action(Class<? extends Request> requestClass, Class<? extends Response> responseClass) {
        this.requestClass = requestClass;
        this.responseClass = responseClass;
    }
}
