package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.firmware.FirmwareStatusNotificationRequest;
import com.tatadok.ocpp.v20.model.firmware.FirmwareStatusNotificationResponse;
import com.tatadok.ocpp.v20.model.firmware.PublishFirmwareStatusNotificationRequest;
import com.tatadok.ocpp.v20.model.firmware.PublishFirmwareStatusNotificationResponse;

public interface CentralSystemFirmwareEventHandler {

    FirmwareStatusNotificationResponse handleFirmwareStatusNotification(String sessionId, String identity,
                                                                        FirmwareStatusNotificationRequest request);

    PublishFirmwareStatusNotificationResponse handlePublishFirmwareStatusNotification(String sessionId, String identity,
                                                                                      PublishFirmwareStatusNotificationRequest request);
}

