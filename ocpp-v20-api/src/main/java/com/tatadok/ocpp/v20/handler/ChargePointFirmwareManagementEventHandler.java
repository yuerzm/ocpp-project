package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.firmware.PublishFirmwareRequest;
import com.tatadok.ocpp.v20.model.firmware.PublishFirmwareResponse;
import com.tatadok.ocpp.v20.model.firmware.UnpublishFirmwareRequest;
import com.tatadok.ocpp.v20.model.firmware.UnpublishFirmwareResponse;
import com.tatadok.ocpp.v20.model.firmware.UpdateFirmwareRequest;
import com.tatadok.ocpp.v20.model.firmware.UpdateFirmwareResponse;

public interface ChargePointFirmwareManagementEventHandler {

    PublishFirmwareResponse handlePublishFirmware(String sessionId, String identity, PublishFirmwareRequest request);

    UpdateFirmwareResponse handleUpdateFirmware(String sessionId, String identity, UpdateFirmwareRequest request);

    UnpublishFirmwareResponse handleUnpublishFirmware(String sessionId, String identity,
                                                      UnpublishFirmwareRequest request);
}

