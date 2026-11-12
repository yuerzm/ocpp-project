package com.cuckooy.ocpp.v16.server.provision;

import com.cuckooy.ocpp.v16.handler.CentralSystemFirmwareEventHandler;
import com.cuckooy.ocpp.v16.model.firmware.DiagnosticsStatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.firmware.DiagnosticsStatusNotificationResponse;
import com.cuckooy.ocpp.v16.model.firmware.FirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.firmware.FirmwareStatusNotificationResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultCentralSystemFirmwareEventHandler implements CentralSystemFirmwareEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public DiagnosticsStatusNotificationResponse handleDiagnosticsStatusNotification(String identity,
                                                                                     DiagnosticsStatusNotificationRequest request) {
        logger.info("Handle DiagnosticsStatusNotificationRequest, request: {}", request);
        return new DiagnosticsStatusNotificationResponse();
    }

    @Override
    public FirmwareStatusNotificationResponse handleFirmwareStatusNotification(String identity,
                                                                               FirmwareStatusNotificationRequest request) {
        logger.info("Handle FirmwareStatusNotificationRequest, request: {}", request);
        return new FirmwareStatusNotificationResponse();
    }
}
