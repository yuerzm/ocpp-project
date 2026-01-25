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

@Getter
public enum Ocpp16Action {

    // core
    Authorize(AuthorizeRequest.class, AuthorizeResponse.class),
    BootNotification(BootNotificationRequest.class, BootNotificationResponse.class),
    ChangeAvailability(ChangeAvailabilityRequest.class, ChangeAvailabilityResponse.class),
    ChangeConfiguration(ChangeConfigurationRequest.class, ChangeConfigurationResponse.class),
    ClearCache(ClearCacheRequest.class, ClearCacheResponse.class),
    DataTransfer(DataTransferRequest.class, DataTransferResponse.class),
    GetConfiguration(GetConfigurationRequest.class, GetConfigurationResponse.class),
    Heartbeat(HeartbeatRequest.class, HeartbeatResponse.class),
    MeterValues(MeterValuesRequest.class, MeterValuesResponse.class),
    RemoteStartTransaction(RemoteStartTransactionRequest.class, RemoteStartTransactionResponse.class),
    RemoteStopTransaction(RemoteStopTransactionRequest.class, RemoteStopTransactionResponse.class),
    Reset(ResetRequest.class, ResetResponse.class),
    StartTransaction(StartTransactionRequest.class, StartTransactionResponse.class),
    StatusNotification(StatusNotificationRequest.class, StatusNotificationResponse.class),
    StopTransaction(StopTransactionRequest.class, StopTransactionResponse.class),
    UnlockConnector(UnlockConnectorRequest.class, UnlockConnectorResponse.class),
    // firmware
    DiagnosticsStatusNotification(DiagnosticsStatusNotificationRequest.class,
        DiagnosticsStatusNotificationResponse.class),
    FirmwareStatusNotification(FirmwareStatusNotificationRequest.class, FirmwareStatusNotificationResponse.class),
    GetDiagnostics(GetDiagnosticsRequest.class, GetDiagnosticsResponse.class),
    UpdateFirmware(UpdateFirmwareRequest.class, UpdateFirmwareResponse.class),
    // local auth list
    GetLocalListVersion(GetLocalListVersionRequest.class, GetLocalListVersionResponse.class),
    SendLocalList(SendLocalListRequest.class, SendLocalListResponse.class),
    // local auth list
    TriggerMessage(TriggerMessageRequest.class, TriggerMessageResponse.class),
    // reservation
    CancelReservation(CancelReservationRequest.class, CancelReservationResponse.class),
    ReserveNow(ReserveNowRequest.class, ReserveNowResponse.class),
    // reservation
    ClearChargingProfile(ClearChargingProfileRequest.class, ClearChargingProfileResponse.class),
    GetCompositeSchedule(GetCompositeScheduleRequest.class, GetCompositeScheduleResponse.class),
    SetChargingProfile(SetChargingProfileRequest.class, SetChargingProfileResponse.class),
    ;

    private final Class<? extends Request> requestClass;
    private final Class<? extends Response> responseClass;

    Ocpp16Action(Class<? extends Request> requestClass, Class<? extends Response> responseClass) {
        this.requestClass = requestClass;
        this.responseClass = responseClass;
    }
}
