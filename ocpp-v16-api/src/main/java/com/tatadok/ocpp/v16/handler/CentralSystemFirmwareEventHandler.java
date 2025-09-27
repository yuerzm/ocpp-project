package com.tatadok.ocpp.v16.handler;

import com.tatadok.ocpp.v16.model.firmware.DiagnosticsStatusNotificationRequest;
import com.tatadok.ocpp.v16.model.firmware.DiagnosticsStatusNotificationResponse;
import com.tatadok.ocpp.v16.model.firmware.FirmwareStatusNotificationRequest;
import com.tatadok.ocpp.v16.model.firmware.FirmwareStatusNotificationResponse;

public interface CentralSystemFirmwareEventHandler {

    DiagnosticsStatusNotificationResponse handleDiagnosticsStatusNotification(String sessionId, String identity,
                                                                              DiagnosticsStatusNotificationRequest request);

    FirmwareStatusNotificationResponse handleFirmwareStatusNotification(String sessionId, String identity,
                                                                        FirmwareStatusNotificationRequest request);
}
