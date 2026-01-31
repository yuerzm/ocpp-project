package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.firmware.PublishFirmwareRequest;
import com.cuckooy.ocpp.v20.model.firmware.PublishFirmwareResponse;
import com.cuckooy.ocpp.v20.model.firmware.UnpublishFirmwareRequest;
import com.cuckooy.ocpp.v20.model.firmware.UnpublishFirmwareResponse;
import com.cuckooy.ocpp.v20.model.firmware.UpdateFirmwareRequest;
import com.cuckooy.ocpp.v20.model.firmware.UpdateFirmwareResponse;

/**
 * The interface Charge point firmware management event handler.
 */
public interface ChargePointFirmwareManagementEventHandler {

    /**
     * Handle publish firmware publish firmware response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the publish firmware response
     */
    PublishFirmwareResponse handlePublishFirmware(String sessionId, String identity, PublishFirmwareRequest request);

    /**
     * Handle update firmware update firmware response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the update firmware response
     */
    UpdateFirmwareResponse handleUpdateFirmware(String sessionId, String identity, UpdateFirmwareRequest request);

    /**
     * Handle unpublish firmware unpublish firmware response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the unpublish firmware response
     */
    UnpublishFirmwareResponse handleUnpublishFirmware(String sessionId, String identity,
                                                      UnpublishFirmwareRequest request);
}

