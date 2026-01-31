package com.cuckooy.ocpp.v16.handler;

import com.cuckooy.ocpp.v16.model.firmware.DiagnosticsStatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.firmware.DiagnosticsStatusNotificationResponse;
import com.cuckooy.ocpp.v16.model.firmware.FirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.firmware.FirmwareStatusNotificationResponse;

/**
 * The interface Central system firmware event handler.
 */
public interface CentralSystemFirmwareEventHandler {

    /**
     * Handle diagnostics status notification diagnostics status notification response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the diagnostics status notification response
     */
    DiagnosticsStatusNotificationResponse handleDiagnosticsStatusNotification(String sessionId, String identity,
                                                                              DiagnosticsStatusNotificationRequest request);

    /**
     * Handle firmware status notification firmware status notification response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the firmware status notification response
     */
    FirmwareStatusNotificationResponse handleFirmwareStatusNotification(String sessionId, String identity,
                                                                        FirmwareStatusNotificationRequest request);
}
