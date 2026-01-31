package com.cuckooy.ocpp.v21.model.displaymessage;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.ClearMessageStatusEnumType;
import lombok.Data;

/**
 * The type Clear display message response.
 */
@Data
public class ClearDisplayMessageResponse implements Response {

    private ClearMessageStatusEnumType status;
    private StatusInfoType statusInfo;
}
