package com.tatadok.ocpp.v21.model.localauth;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.SendLocalListStatusEnumType;
import lombok.Data;

@Data
public class SendLocalListResponse implements Response {

    private SendLocalListStatusEnumType status;
    private StatusInfoType statusInfo;
}
