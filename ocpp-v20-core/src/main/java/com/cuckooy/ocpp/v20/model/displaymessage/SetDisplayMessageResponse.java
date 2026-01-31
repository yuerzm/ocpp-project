package com.cuckooy.ocpp.v20.model.displaymessage;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.DisplayMessageStatusEnumType;
import lombok.Data;

/**
 * The type Set display message response.
 */
@Data
public class SetDisplayMessageResponse implements Response {

    private DisplayMessageStatusEnumType status;
    private StatusInfoType statusInfo;
}
