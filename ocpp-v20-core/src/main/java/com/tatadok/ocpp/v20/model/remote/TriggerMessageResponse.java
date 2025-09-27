package com.tatadok.ocpp.v20.model.remote;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.TriggerMessageStatusEnumType;
import lombok.Data;

@Data
public class TriggerMessageResponse implements Response {

    private TriggerMessageStatusEnumType status;
    private StatusInfoType statusInfo;
}
