package com.cuckooy.ocpp.v20.model.remote;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.TriggerMessageStatusEnumType;
import lombok.Data;

@Data
public class TriggerMessageResponse implements Response {

    private TriggerMessageStatusEnumType status;
    private StatusInfoType statusInfo;
}
