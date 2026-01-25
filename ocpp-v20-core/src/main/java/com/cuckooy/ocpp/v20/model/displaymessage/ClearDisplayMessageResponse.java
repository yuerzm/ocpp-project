package com.cuckooy.ocpp.v20.model.displaymessage;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.ClearMessageStatusEnumType;
import lombok.Data;

@Data
public class ClearDisplayMessageResponse implements Response {

    private ClearMessageStatusEnumType status;
    private StatusInfoType statusInfo;
}
