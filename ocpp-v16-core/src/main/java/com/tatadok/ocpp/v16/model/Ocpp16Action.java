package com.tatadok.ocpp.v16.model;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v16.model.core.AuthorizeRequest;
import com.tatadok.ocpp.v16.model.core.AuthorizeResponse;
import com.tatadok.ocpp.v16.model.core.BootNotificationRequest;
import com.tatadok.ocpp.v16.model.core.BootNotificationResponse;
import com.tatadok.ocpp.v16.model.core.ChangeAvailabilityRequest;
import com.tatadok.ocpp.v16.model.core.ChangeAvailabilityResponse;
import com.tatadok.ocpp.v16.model.core.ChangeConfigurationRequest;
import com.tatadok.ocpp.v16.model.core.ChangeConfigurationResponse;
import com.tatadok.ocpp.v16.model.core.ClearCacheRequest;
import com.tatadok.ocpp.v16.model.core.ClearCacheResponse;
import com.tatadok.ocpp.v16.model.core.DataTransferRequest;
import com.tatadok.ocpp.v16.model.core.DataTransferResponse;
import com.tatadok.ocpp.v16.model.core.GetConfigurationRequest;
import com.tatadok.ocpp.v16.model.core.GetConfigurationResponse;
import com.tatadok.ocpp.v16.model.core.HeartbeatRequest;
import com.tatadok.ocpp.v16.model.core.HeartbeatResponse;
import com.tatadok.ocpp.v16.model.core.MeterValuesRequest;
import com.tatadok.ocpp.v16.model.core.MeterValuesResponse;
import com.tatadok.ocpp.v16.model.core.RemoteStartTransactionRequest;
import com.tatadok.ocpp.v16.model.core.RemoteStartTransactionResponse;
import com.tatadok.ocpp.v16.model.core.RemoteStopTransactionRequest;
import com.tatadok.ocpp.v16.model.core.RemoteStopTransactionResponse;
import com.tatadok.ocpp.v16.model.core.ResetRequest;
import com.tatadok.ocpp.v16.model.core.ResetResponse;
import com.tatadok.ocpp.v16.model.core.StartTransactionRequest;
import com.tatadok.ocpp.v16.model.core.StartTransactionResponse;
import com.tatadok.ocpp.v16.model.core.StatusNotificationRequest;
import com.tatadok.ocpp.v16.model.core.StatusNotificationResponse;
import com.tatadok.ocpp.v16.model.core.StopTransactionRequest;
import com.tatadok.ocpp.v16.model.core.StopTransactionResponse;
import com.tatadok.ocpp.v16.model.core.UnlockConnectorRequest;
import com.tatadok.ocpp.v16.model.core.UnlockConnectorResponse;
import com.tatadok.ocpp.v16.model.firmware.DiagnosticsStatusNotificationRequest;
import com.tatadok.ocpp.v16.model.firmware.DiagnosticsStatusNotificationResponse;
import com.tatadok.ocpp.v16.model.firmware.FirmwareStatusNotificationRequest;
import com.tatadok.ocpp.v16.model.firmware.FirmwareStatusNotificationResponse;
import com.tatadok.ocpp.v16.model.firmware.GetDiagnosticsRequest;
import com.tatadok.ocpp.v16.model.firmware.GetDiagnosticsResponse;
import com.tatadok.ocpp.v16.model.firmware.UpdateFirmwareRequest;
import com.tatadok.ocpp.v16.model.firmware.UpdateFirmwareResponse;
import com.tatadok.ocpp.v16.model.localauthlist.GetLocalListVersionRequest;
import com.tatadok.ocpp.v16.model.localauthlist.GetLocalListVersionResponse;
import com.tatadok.ocpp.v16.model.localauthlist.SendLocalListRequest;
import com.tatadok.ocpp.v16.model.localauthlist.SendLocalListResponse;
import com.tatadok.ocpp.v16.model.remotetrigger.TriggerMessageRequest;
import com.tatadok.ocpp.v16.model.remotetrigger.TriggerMessageResponse;
import com.tatadok.ocpp.v16.model.reservation.CancelReservationRequest;
import com.tatadok.ocpp.v16.model.reservation.CancelReservationResponse;
import com.tatadok.ocpp.v16.model.reservation.ReserveNowRequest;
import com.tatadok.ocpp.v16.model.reservation.ReserveNowResponse;
import com.tatadok.ocpp.v16.model.smartcharging.ClearChargingProfileRequest;
import com.tatadok.ocpp.v16.model.smartcharging.ClearChargingProfileResponse;
import com.tatadok.ocpp.v16.model.smartcharging.GetCompositeScheduleRequest;
import com.tatadok.ocpp.v16.model.smartcharging.GetCompositeScheduleResponse;
import com.tatadok.ocpp.v16.model.smartcharging.SetChargingProfileRequest;
import com.tatadok.ocpp.v16.model.smartcharging.SetChargingProfileResponse;
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
