package com.cuckooy.ocpp.v21.model.remote;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.TriggerMessageStatusEnumType;
import lombok.Data;

@Data
public class TriggerMessageResponse implements Response {

    private TriggerMessageStatusEnumType status;
    private StatusInfoType statusInfo;
}
