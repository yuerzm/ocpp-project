package com.cuckooy.ocpp.v21.model.bidirectional;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.GenericStatusEnumType;
import lombok.Data;

/**
 * The type Afrr signal response.
 */
@Data
public class AFRRSignalResponse implements Response {

    private GenericStatusEnumType status;
    private StatusInfoType statusInfo;
}
