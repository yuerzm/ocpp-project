package com.cuckooy.ocpp.v21.model.firmware;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.GenericStatusEnumType;
import lombok.Data;

/**
 * The type Publish firmware response.
 */
@Data
public class PublishFirmwareResponse implements Response {

    private GenericStatusEnumType status;
    private StatusInfoType statusInfo;
}
