package com.cuckooy.ocpp.v21.model.firmware;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.enumerations.UnpublishFirmwareStatusEnumType;
import lombok.Data;

/**
 * The type Unpublish firmware response.
 */
@Data
public class UnpublishFirmwareResponse implements Response {

    private UnpublishFirmwareStatusEnumType status;
}
