package com.tatadok.ocpp.v20.model.localauth;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v20.model.common.enumerations.SendLocalListStatusEnumType;
import lombok.Data;

@Data
public class SendLocalListResponse implements Response {

    private SendLocalListStatusEnumType status;
    private StatusInfoType statusInfo;
}
