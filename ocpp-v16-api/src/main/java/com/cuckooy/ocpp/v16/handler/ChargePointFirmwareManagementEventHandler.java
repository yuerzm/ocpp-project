package com.cuckooy.ocpp.v16.handler;

import com.cuckooy.ocpp.v16.model.firmware.GetDiagnosticsRequest;
import com.cuckooy.ocpp.v16.model.firmware.GetDiagnosticsResponse;
import com.cuckooy.ocpp.v16.model.firmware.UpdateFirmwareRequest;
import com.cuckooy.ocpp.v16.model.firmware.UpdateFirmwareResponse;

/**
 * The interface Charge point firmware management event handler.
 */
public interface ChargePointFirmwareManagementEventHandler {

    /**
     * Handle get diagnostics get diagnostics response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the get diagnostics response
     */
    GetDiagnosticsResponse handleGetDiagnostics(String identity, GetDiagnosticsRequest request);

    /**
     * Handle update firmware update firmware response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the update firmware response
     */
    UpdateFirmwareResponse handleUpdateFirmware(String identity, UpdateFirmwareRequest request);
}
