package com.tatadok.ocpp.v21.model.displaymessage;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.GetDisplayMessagesStatusEnumType;
import lombok.Data;

@Data
public class GetDisplayMessagesResponse implements Response {

    private GetDisplayMessagesStatusEnumType status;
    private StatusInfoType statusInfo;
}
