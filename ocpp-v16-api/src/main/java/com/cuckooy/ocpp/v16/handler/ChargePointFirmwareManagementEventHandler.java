package com.cuckooy.ocpp.v16.handler;

import com.cuckooy.ocpp.v16.model.firmware.GetDiagnosticsRequest;
import com.cuckooy.ocpp.v16.model.firmware.GetDiagnosticsResponse;
import com.cuckooy.ocpp.v16.model.firmware.UpdateFirmwareRequest;
import com.cuckooy.ocpp.v16.model.firmware.UpdateFirmwareResponse;

public interface ChargePointFirmwareManagementEventHandler {

    GetDiagnosticsResponse handleGetDiagnostics(String sessionId, String identity, GetDiagnosticsRequest request);

    UpdateFirmwareResponse handleUpdateFirmware(String sessionId, String identity, UpdateFirmwareRequest request);
}
