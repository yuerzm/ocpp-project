package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.firmware.FirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.firmware.FirmwareStatusNotificationResponse;
import com.cuckooy.ocpp.v20.model.firmware.PublishFirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.firmware.PublishFirmwareStatusNotificationResponse;

/**
 * The interface Central system firmware event handler.
 */
public interface CentralSystemFirmwareEventHandler {

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

    /**
     * Handle publish firmware status notification publish firmware status notification response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the publish firmware status notification response
     */
    PublishFirmwareStatusNotificationResponse handlePublishFirmwareStatusNotification(String sessionId, String identity,
                                                                                      PublishFirmwareStatusNotificationRequest request);
}

