package com.cuckooy.ocpp.v21.model.displaymessage;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.GetDisplayMessagesStatusEnumType;
import lombok.Data;

@Data
public class GetDisplayMessagesResponse implements Response {

    private GetDisplayMessagesStatusEnumType status;
    private StatusInfoType statusInfo;
}
